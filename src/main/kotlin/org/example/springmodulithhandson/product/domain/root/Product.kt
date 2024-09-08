package org.example.springmodulithhandson.product.domain.root

import jakarta.persistence.Entity
import org.example.springmodulithhandson.common.BaseAggregateRoot
import org.example.springmodulithhandson.product.ProductCreatedEvent

@Entity
class Product(
    val name: String,
    val description: String,
    val price: Int,
) : BaseAggregateRoot<Product>() {
    companion object {
        fun create(
            name: String,
            description: String,
            price: Int,
        ): Product =
            Product(name, description, price)
                .apply { registerEvent(ProductCreatedEvent(this)) }
    }
}
