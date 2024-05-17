package me.nasiri.breezy.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import me.nasiri.breezy.presentation.ui.theme.BreezyTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // todo fix this
        enableEdgeToEdge()
        setContent {
            BreezyTheme {
                App()
            }
        }
    }
}