package org.example.studymysqlsharding.basic

import jakarta.persistence.*
import java.time.LocalDate


@Entity
@Table(name = "order_detail")
class OrderDetail(

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
        fun random() : OrderDetail{
            val orderDetail = OrderDetail()
            orderDetail.orderDetailId = (1L..1000000L).random()
            orderDetail.customerId = (1L..1000000L).random()
            orderDetail.totalPrice = (1L..1000000L).random()
            orderDetail.orderStatus = "ORDERED"
            orderDetail.orderDate = LocalDate.now()
            orderDetail.deliveryAddress = "HERE"
            return orderDetail
        }
    }
}