package me.nasiri.breezy.domain.util

import android.os.Build
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun LocalDateTime.convertToDataTime(): String {

    val inputDateTime = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        LocalDateTime.parse(this.toString(), DateTimeFormatter.ISO_DATE_TIME)
    } else {
        TODO("VERSION.SDK_INT < O")
    }

    val dayOfWeek = inputDateTime.dayOfWeek.getDisplayName(
        java.time.format.TextStyle.FULL,
        java.util.Locale.getDefault()
    )

    val dateFormatter = DateTimeFormatter.ofPattern("d MMMM")
    val formattedDate = inputDateTime.format(dateFormatter)

    return "$dayOfWeek, $formattedDate"
}

fun LocalDateTime.convertToTime(): String {
    val timeFormatter = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        DateTimeFormatter.ofPattern("HH:mm")
    } else {
        TODO("VERSION.SDK_INT < O")
    }
    return this.format(timeFormatter)
}