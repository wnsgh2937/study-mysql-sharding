package org.example.studymysqlsharding.basic

import jakarta.persistence.*
import java.time.LocalDate


@Entity
@Table(name = "order_detail")
class Order(

) {

    @Id
    @Column(name = "order_detail_id")
    var orderDetailId: Long? = null

    @Column(name = "customer_id")
    var customerId: Long? = null

    @Column(name = "total_price")
    var totalPrice: Long? = null

    @Column(name = "order_status")
    var orderStatus: String? = null

    @Column(name = "order_date")
    var orderDate: LocalDate? = null

    @Column(name = "delivery_address")
    var deliveryAddress: String? = null // ... getter and setters

    companion object{
        fun random() : Order{
            val order = Order()
            order.orderDetailId = (1L..1000000L).random()
            order.customerId = (1L..1000000L).random()
            order.totalPrice = (1L..1000000L).random()
            order.orderStatus = "ORDERED"
            order.orderDate = LocalDate.now()
            order.deliveryAddress = "HERE"
            return order
        }
    }
}