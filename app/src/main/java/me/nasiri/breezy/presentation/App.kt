package me.nasiri.breezy.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import me.nasiri.breezy.presentation.ui.elements.WeatherDetails
import me.nasiri.breezy.presentation.ui.elements.Weekly

@Composable
fun App() {
    WeatherDetails()
}

@Preview
@Composable
private fun AppPreview() {
    App()
}