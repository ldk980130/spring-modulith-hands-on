package org.example.springmodulithhandson.notification.domain.root

import org.example.springmodulithhandson.notification.domain.NotificationType
import java.time.LocalDateTime

class Notification(
    val productName: String,
    val date: LocalDateTime,
    val format: NotificationType,
)
