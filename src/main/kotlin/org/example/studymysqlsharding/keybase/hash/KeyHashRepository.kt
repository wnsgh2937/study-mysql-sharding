package org.example.studymysqlsharding.keybase.hash

import org.springframework.data.jpa.repository.JpaRepository

interface KeyHashRepository : JpaRepository<KeyHashEntity?, Long?>{

//    fun findByOrderId(orderId: Long) : Order
}