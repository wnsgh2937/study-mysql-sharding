package org.example.studymysqlsharding.basic

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api")
class OrderService(
        private val orderRepository: OrderRepository
) {

    @GetMapping("/test")
    fun fun0() : ResponseEntity<String>{
        val orderDetail = OrderDetail.random()
        orderRepository.save(orderDetail)
        return ResponseEntity.ok(orderDetail.orderDetailId.toString())
    }
}
