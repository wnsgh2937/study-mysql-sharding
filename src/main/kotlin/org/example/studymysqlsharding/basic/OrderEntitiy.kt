//package org.example.studymysqlsharding.basic
//
//import jakarta.persistence.*
//import java.math.BigDecimal
//import java.time.LocalDate
//
//
//@Entity
//@Table(name = "`order`")
//class Order {
//    @Id
//    @Column(name = "order_id")
//    private val orderId: Long? = null
//
//    @Column(name = "customer_id")
//    private val customerId: Long? = null
//
//    @Column(name = "total_price")
//    private val totalPrice: BigDecimal? = null
//
//    @Enumerated(EnumType.STRING)
//    @Column(name = "order_status")
//    private val orderStatus: String? = null
//
//    @Column(name = "order_date")
//    private val orderDate: LocalDate? = null
//
//    @Column(name = "delivery_address")
//    private val deliveryAddress: String? = null // ... getter and setters
//}