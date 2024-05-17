package me.nasiri.breezy.data.remote

import com.squareup.moshi.Json
import me.nasiri.breezy.data.remote.WeatherDataDto

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
