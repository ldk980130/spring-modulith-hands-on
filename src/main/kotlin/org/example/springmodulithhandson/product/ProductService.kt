package org.example.springmodulithhandson.product

import org.example.springmodulithhandson.notification.NotificationRequest
import org.example.springmodulithhandson.notification.NotificationService
import org.example.springmodulithhandson.product.intenral.Product
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ProductService(
    private val notificationService: NotificationService,
) {
    fun create(product: Product) {
        notificationService.createNotification(
            NotificationRequest(
                productName = product.name,
                date = LocalDateTime.now(),
                format = "SMS",
            ),
        )
    }
}
