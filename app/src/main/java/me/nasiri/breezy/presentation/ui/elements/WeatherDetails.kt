package me.nasiri.breezy.presentation.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nasiri.breezy.R
import me.nasiri.breezy.domain.weather.WeatherData
import kotlin.math.roundToInt

@Composable
fun WeatherDetails(
    data: WeatherData,
    contentColor: Color = MaterialTheme.colorScheme.secondary,
    containerColor: Color = MaterialTheme.colorScheme.primary,
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(containerColor, RoundedCornerShape(12.dp))
            .padding(horizontal = 10.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        WeatherDetailItem(
            value = "${data.windSpeed}",
            icon = painterResource(id = R.drawable.ic_wind),
            type = "km/h",
            liable = stringResource(id = R.string.wind),
            contentColor = contentColor
        )
        WeatherDetailItem(
            value = "${data.humidity}",
            icon = painterResource(id = R.drawable.ic_drop),
            type = "%",
            liable = stringResource(id = R.string.humidity),
            contentColor = contentColor
        )
        WeatherDetailItem(
            value = "${data.pressure.roundToInt()}",
            icon = painterResource(id = R.drawable.ic_pressure),
            type = "hpa",
            liable = stringResource(id = R.string.pressure),
            contentColor = contentColor
        )
    }
}

@Composable
private fun WeatherDetailItem(
    icon: Painter,
    value: String,
    type: String,
    liable: String,
    contentColor: Color,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(painter = icon, contentDescription = null, tint = contentColor)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(color = contentColor, text = value, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Text(color = contentColor, text = type, fontSize = 11.sp)
        }
        Text(color = contentColor, text = liable)
    }
}