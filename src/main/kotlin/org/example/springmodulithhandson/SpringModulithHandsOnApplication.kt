package org.example.springmodulithhandson

import org.example.springmodulithhandson.product.Product
import org.example.springmodulithhandson.product.ProductService
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringModulithHandsOnApplication

fun main(args: Array<String>) {
    runApplication<SpringModulithHandsOnApplication>(*args)
        .getBean(ProductService::class.java)
        .create(Product("Product 1", "Description 1", 100))
}
