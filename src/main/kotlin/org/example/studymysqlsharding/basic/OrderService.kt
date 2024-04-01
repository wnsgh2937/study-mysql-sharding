package org.example.studymysqlsharding.basic

import org.springframework.stereotype.Service

@Service
class OrderService(
        private val orderRepository: OrderRepository
) {

    fun fun0(){
        orderRepository.save(Order.random())
    }
}