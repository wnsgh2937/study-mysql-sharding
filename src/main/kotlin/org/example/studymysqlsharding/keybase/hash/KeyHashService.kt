package org.example.studymysqlsharding.keybase.hash

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/api")
class KeyHashService(
        private val keyHashRepository: KeyHashRepository
) {

    @GetMapping("/test")
    fun fun0() : ResponseEntity<String>{
        val keyHashEntity = KeyHashEntity.random()
        keyHashRepository.save(keyHashEntity)
        return ResponseEntity.ok(keyHashEntity.orderDetailId.toString())
    }
}
