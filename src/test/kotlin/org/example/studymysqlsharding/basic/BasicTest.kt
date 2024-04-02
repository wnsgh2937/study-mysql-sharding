package org.example.studymysqlsharding.basic

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class BasicTest @Autowired constructor(
        val orderRepository: OrderRepository
){

    @Test
    fun test0(){

        val order = Order.random()

        orderRepository.save(order)

        val foundedOrder = orderRepository.findById(order.orderDetailId!!)

        require(order.orderDetailId == foundedOrder.get().orderDetailId)
    }

}