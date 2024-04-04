package org.example.studymysqlsharding.keybase.hash

import jakarta.persistence.*


@Entity
@Table(name = "key_hash")
class KeyHashEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column
    var userId: Long? = null

    @Column
    var foo: String = "foo"
}