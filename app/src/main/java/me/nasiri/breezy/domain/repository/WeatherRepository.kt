package me.nasiri.breezy.domain.repository

import me.nasiri.breezy.domain.util.Resource
import me.nasiri.breezy.domain.weather.WeatherInfo


interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}