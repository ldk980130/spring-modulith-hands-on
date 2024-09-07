package org.example.springmodulithhandson.notification

import io.github.oshai.kotlinlogging.KotlinLogging
import org.example.springmodulithhandson.notification.internal.Notification
import org.example.springmodulithhandson.notification.internal.NotificationType
import org.springframework.modulith.events.ApplicationModuleListener
import org.springframework.stereotype.Service

@Service
class NotificationService {
    private val logger = KotlinLogging.logger { }

    @ApplicationModuleListener
    fun createNotification(request: NotificationRequest) {
        val notification =
            Notification(
                productName = request.productName,
                date = request.date,
                format = NotificationType.valueOf(request.format),
            )

        logger.info {
            "Received Notification by module dependency for " +
                "product ${notification.productName} " +
                "in date ${notification.date} " +
                "by ${notification.format}"
        }
    }
}
