package me.nasiri.breezy.presentation.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nasiri.breezy.R

@Composable
fun WeatherDetails(/*todo get state and content color*/) {
    val contentColor = Color.Red

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black, RoundedCornerShape(12.dp))
            .padding(horizontal = 10.dp, vertical = 14.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        WeatherDetailItem(
            icon = Icons.Default.Star,
            label = stringResource(id = R.string.sp_wind),
            value = stringResource(id = R.string.wind),
            contentColor = contentColor
        )
        WeatherDetailItem(
            icon = Icons.Default.Star,
            label = stringResource(id = R.string.sp_humidity),
            value = stringResource(id = R.string.humidity),
            contentColor = contentColor
        )
        WeatherDetailItem(
            icon = Icons.Default.Star,
            label = stringResource(id = R.string.sp_visibility),
            value = stringResource(id = R.string.visibility),
            contentColor = contentColor
        )
    }
}

@Composable
private fun WeatherDetailItem(
    icon: ImageVector,
    label: String,
    value: String,
    contentColor: Color,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        /*todo 1.change size 2.find the icons*/
        Icon(imageVector = icon, contentDescription = null, tint = contentColor)
        Text(
            color = contentColor, text = label, fontWeight = FontWeight.Bold, fontSize = 24.sp
        )
        Text(color = contentColor, text = value)
    }
}


@Preview(showBackground = true)
@Composable
private fun WeatherDetailsPreview() {
    WeatherDetails()
}