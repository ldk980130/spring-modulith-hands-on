package org.example.springmodulithhandson.notification.domain

import java.time.LocalDateTime

class Notification(
    val productName: String,
    val date: LocalDateTime,
    val format: NotificationType,
)
