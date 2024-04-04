package org.example.studymysqlsharding.basic

import org.example.studymysqlsharding.keybase.hash.KeyHashEntity
import org.example.studymysqlsharding.keybase.hash.KeyHashRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest


@SpringBootTest
class BasicTest @Autowired constructor(
        val keyHashRepository: KeyHashRepository
){

    @Test
    fun test0(){

        val keyHashEntity = KeyHashEntity.random()

        keyHashRepository.save(keyHashEntity)
//
        val foundedOrder = keyHashRepository.findById(keyHashEntity.orderDetailId!!)

        require(keyHashEntity.orderDetailId == foundedOrder.get().orderDetailId)
    }

}