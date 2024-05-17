package me.nasiri.breezy.domain.weather

import me.nasiri.breezy.domain.weather.WeatherData

data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,
    val currentWeatherData: WeatherData?
)
