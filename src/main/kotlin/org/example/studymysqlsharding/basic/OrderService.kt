package org.example.studymysqlsharding.basic

import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api")
class OrderService(
        private val orderRepository: OrderRepository
) {

    @GetMapping("/test")
    fun fun0(){
        val order = Order.random()
        orderRepository.save(order)
    }
}
