package me.nasiri.breezy.presentation.ui.elements

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nasiri.breezy.R
import me.nasiri.breezy.domain.util.convertToTime
import me.nasiri.breezy.domain.weather.WeatherData


@Composable
fun HourlyWeather(data: List<WeatherData>) {

    Column(verticalArrangement = Arrangement.spacedBy(18.dp)) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.today),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Icon(
                modifier = Modifier.size(width = 45.dp, height = 15.dp),
                painter = painterResource(id = R.drawable.ic_arrow),
                contentDescription = null
            )
        }

        LazyRow {
            items(data) { each ->
                HourlyWeatherItem(
                    temperatureCelsius = each.temperatureCelsius.toString(),
                    icon = each.weatherType.iconRes,
                    time = each.time.convertToTime()
                )
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
    }
}

@Composable
private fun HourlyWeatherItem(
    temperatureCelsius: String,
    icon: Int,
    time: String,
) {
    Column(
        modifier = Modifier
            .border(2.dp, Color.Black, RoundedCornerShape(12.dp))
            .padding(horizontal = 12.dp, vertical = 14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "$temperatureCelsius°C", fontWeight = FontWeight.Bold)
        Icon(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Text(text = time)
    }
}