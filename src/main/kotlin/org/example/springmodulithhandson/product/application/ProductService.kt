package org.example.springmodulithhandson.product.application

import org.example.springmodulithhandson.product.CreateProduct
import org.example.springmodulithhandson.product.ProductRequest
import org.example.springmodulithhandson.product.domain.ProductRepository
import org.example.springmodulithhandson.product.domain.root.Product
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class ProductService(
    private val productRepository: ProductRepository,
) : CreateProduct {
    override fun create(request: ProductRequest) {
        Product
            .create(
                name = request.name,
                price = request.price,
                description = request.description,
            ).run { productRepository.save(this) }
    }
}
