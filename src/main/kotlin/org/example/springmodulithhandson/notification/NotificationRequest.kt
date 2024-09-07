package org.example.springmodulithhandson.notification

import java.time.LocalDateTime

data class NotificationRequest(
    val productName: String,
    val date: LocalDateTime,
    val format: String,
)
