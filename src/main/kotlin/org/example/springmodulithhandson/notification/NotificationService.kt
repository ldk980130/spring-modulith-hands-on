package org.example.springmodulithhandson.notification

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service

@Service
class NotificationService {
    private val logger = KotlinLogging.logger { }

    fun createNotification(notification: Notification) {
        logger.info {
            "Received Notification by module dependency for " +
                "product ${notification.productName} " +
                "in date ${notification.date} " +
                "by ${notification.format}"
        }
    }
}
