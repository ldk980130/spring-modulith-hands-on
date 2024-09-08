package org.example.springmodulithhandson

import org.example.springmodulithhandson.product.CreateProduct
import org.example.springmodulithhandson.product.ProductRequest
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringModulithHandsOnApplication

fun main(args: Array<String>) {
    runApplication<SpringModulithHandsOnApplication>(*args)
        .getBean(CreateProduct::class.java)
        .create(ProductRequest("Product", "Description", 100))
}
