package org.example.springmodulithhandson.product.application

import org.example.springmodulithhandson.product.CreateProduct
import org.example.springmodulithhandson.product.ProductCreatedEvent
import org.example.springmodulithhandson.product.ProductRequest
import org.example.springmodulithhandson.product.domain.ProductRepository
import org.example.springmodulithhandson.product.domain.root.Product
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ProductService(
    private val productRepository: ProductRepository,
    private val eventPublisher: ApplicationEventPublisher,
) : CreateProduct {
    override fun create(request: ProductRequest) {
        Product(
            name = request.name,
            price = request.price,
            description = request.description,
        ).run { productRepository.save(this) }
            .also { eventPublisher.publishEvent(ProductCreatedEvent(it)) }
    }
}
