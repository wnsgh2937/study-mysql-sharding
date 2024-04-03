package org.example.studymysqlsharding.basic

import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository : JpaRepository<OrderDetail?, Long?>{

//    fun findByOrderId(orderId: Long) : Order
}