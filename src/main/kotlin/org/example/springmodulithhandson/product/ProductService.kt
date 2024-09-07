package org.example.springmodulithhandson.product

import org.example.springmodulithhandson.notification.Notification
import org.example.springmodulithhandson.notification.NotificationService
import org.example.springmodulithhandson.notification.NotificationType
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class ProductService(
    private val notificationService: NotificationService,
) {
    fun create(product: Product) {
        Notification(
            productName = product.name,
            date = LocalDateTime.now(),
            format = NotificationType.EMAIL,
        ).run {
            notificationService.createNotification(this)
        }
    }
}
