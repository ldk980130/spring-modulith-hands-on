package org.example.springmodulithhandson.product

import org.example.springmodulithhandson.notification.NotificationRequest
import org.example.springmodulithhandson.product.intenral.Product
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ProductService(
    private val eventPublisher: ApplicationEventPublisher,
) {
    fun create(product: Product) {
        eventPublisher.publishEvent(
            NotificationRequest(
                productName = product.name,
                date = LocalDateTime.now(),
                format = "SMS",
            ),
        )
    }
}
