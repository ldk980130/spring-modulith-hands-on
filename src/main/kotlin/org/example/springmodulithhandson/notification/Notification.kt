package org.example.springmodulithhandson.notification

import java.time.LocalDateTime

class Notification(
    val productName: String,
    val date: LocalDateTime,
    val format: NotificationType,
)
