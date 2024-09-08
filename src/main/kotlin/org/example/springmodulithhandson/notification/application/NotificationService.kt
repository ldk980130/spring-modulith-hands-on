package org.example.springmodulithhandson.notification.application

import io.github.oshai.kotlinlogging.KotlinLogging
import org.example.springmodulithhandson.notification.CreateNotification
import org.example.springmodulithhandson.notification.NotificationRequest
import org.example.springmodulithhandson.notification.domain.Notification
import org.example.springmodulithhandson.notification.domain.NotificationType
import org.springframework.modulith.events.ApplicationModuleListener
import org.springframework.stereotype.Service

@Service
class NotificationService : CreateNotification {
    private val logger = KotlinLogging.logger { }

    @ApplicationModuleListener
    override fun create(request: NotificationRequest) {
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
