package org.example.springmodulithhandson.notification.internal

import java.time.LocalDateTime

class Notification(
    val productName: String,
    val date: LocalDateTime,
    val format: NotificationType,
)
