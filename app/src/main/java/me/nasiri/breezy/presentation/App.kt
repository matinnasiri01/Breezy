package me.nasiri.breezy.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.nasiri.breezy.presentation.ui.elements.DailySummary
import me.nasiri.breezy.presentation.ui.elements.Header
import me.nasiri.breezy.presentation.ui.elements.WeatherDetails
import me.nasiri.breezy.presentation.ui.elements.Weekly

@Composable
fun App(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .padding(top = 30.dp),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        Header(Color.White)
        DailySummary()
        WeatherDetails(Color.White)
        Weekly()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun AppPreview() {
    App()
}