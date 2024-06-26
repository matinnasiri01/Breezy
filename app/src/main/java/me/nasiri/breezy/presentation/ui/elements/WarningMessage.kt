package me.nasiri.breezy.presentation.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import me.nasiri.breezy.R


@Composable
fun WarningMessage(
    modifier: Modifier = Modifier,
    message: String?,
    grColor: Color = MaterialTheme.colorScheme.error,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Yellow, RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .border(2.dp, grColor, RoundedCornerShape(12.dp))
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_warning),
            contentDescription = null,
            tint = grColor
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            color = grColor,
            text = message!!,
            maxLines = 1,
            fontWeight = FontWeight.Bold
        )
    }
}
