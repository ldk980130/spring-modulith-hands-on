package org.example.springmodulithhandson.product

import org.example.springmodulithhandson.product.domain.Product

data class ProductCreatedEvent(
    val product: Product,
)
