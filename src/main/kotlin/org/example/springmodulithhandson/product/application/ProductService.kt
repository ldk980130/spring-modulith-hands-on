package org.example.springmodulithhandson.product.application

import org.example.springmodulithhandson.notification.NotificationRequest
import org.example.springmodulithhandson.product.CreateProduct
import org.example.springmodulithhandson.product.domain.Product
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ProductService(
    private val eventPublisher: ApplicationEventPublisher,
) : CreateProduct {
    override fun create(product: Product) {
        eventPublisher.publishEvent(
            NotificationRequest(
                productName = product.name,
                date = LocalDateTime.now(),
                format = "SMS",
            ),
        )
    }
}
