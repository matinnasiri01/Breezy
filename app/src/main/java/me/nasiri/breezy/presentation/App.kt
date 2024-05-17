package me.nasiri.breezy.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import me.nasiri.breezy.presentation.ui.elements.Header
import me.nasiri.breezy.presentation.ui.elements.Progress
import me.nasiri.breezy.presentation.ui.elements.StatusMessage
import me.nasiri.breezy.presentation.ui.elements.WeatherDetails
import me.nasiri.breezy.presentation.ui.elements.Weekly

@Composable
fun App(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            /*todo get this from system*/
            .padding(top = 30.dp, bottom = 50.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(18.dp)
    ) {
        StatusMessage()
        Header(Color.White)
        WeatherDetails(Color.White)
        Weekly()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun AppPreview() {
    App()
}