package org.example.springmodulithhandson.product

import org.example.springmodulithhandson.product.domain.Product

interface CreateProduct {
    fun create(product: Product)
}
