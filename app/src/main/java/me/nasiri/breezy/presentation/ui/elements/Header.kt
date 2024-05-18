package me.nasiri.breezy.presentation.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nasiri.breezy.domain.util.convertToDataTime
import me.nasiri.breezy.domain.util.convertToTime
import me.nasiri.breezy.domain.weather.WeatherData


@Composable
fun Header(
    data: WeatherData, contentColor: Color = MaterialTheme.colorScheme.secondary,
    containerColor: Color = MaterialTheme.colorScheme.primary,
) {

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {

        Text(
            color = contentColor,
            text = data.time.convertToDataTime(),
            modifier = Modifier
                .background(containerColor, RoundedCornerShape(24.dp))
                .padding(horizontal = 16.dp, vertical = 4.dp)
        )

        Text(text = data.time.convertToTime(), color = containerColor)

        Icon(
            modifier = Modifier
                .width(200.dp)
                .padding(vertical = 4.dp),
            painter = painterResource(id = data.weatherType.iconRes),
            contentDescription = null,
            tint = containerColor
        )

        Text(
            text = "${data.temperatureCelsius}°C",
            fontSize = 72.sp,
            fontWeight = FontWeight.Bold,
            color = containerColor
        )

        Text(text = data.weatherType.weatherDesc, color = containerColor)
    }
}