package me.nasiri.breezy.presentation

import me.nasiri.breezy.domain.weather.WeatherInfo


data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null,
)
