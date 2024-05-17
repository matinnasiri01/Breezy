package me.nasiri.breezy.data.repository

import android.os.Build
import androidx.annotation.RequiresApi
import me.nasiri.breezy.data.mappers.toWeatherInfo
import me.nasiri.breezy.data.remote.WeatherApi
import me.nasiri.breezy.domain.repository.WeatherRepository
import me.nasiri.breezy.domain.util.Resource
import me.nasiri.breezy.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}