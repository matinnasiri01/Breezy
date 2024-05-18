package me.nasiri.breezy.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import me.nasiri.breezy.presentation.ui.elements.Header
import me.nasiri.breezy.presentation.ui.elements.HourlyWeather
import me.nasiri.breezy.presentation.ui.elements.WarningMessage
import me.nasiri.breezy.presentation.ui.elements.WeatherDetails

@Composable
fun App(state: WeatherState, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 35.dp, bottom = 50.dp)
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            state.weatherInfo?.currentWeatherData?.let { data ->
                Spacer(modifier = Modifier.height(10.dp))
                Header(data)
                WeatherDetails()
                HourlyWeather()
            }
        }

        if (state.isLoading) CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))

        state.error?.let {
            WarningMessage(message = it, modifier = Modifier.align(Alignment.Center))
        }
    }
}