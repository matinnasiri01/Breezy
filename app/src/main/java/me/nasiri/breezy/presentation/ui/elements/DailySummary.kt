package me.nasiri.breezy.presentation.ui.elements

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nasiri.breezy.R


@Composable
fun DailySummary(/*todo get summary from state!*/) {
    Column {
        Text(
            text = stringResource(id = R.string.daily_summary),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = stringResource(id = R.string.sp_summary))
    }
}


@Preview(showBackground = true)
@Composable
private fun DailySummaryPreview() {
    DailySummary()
}