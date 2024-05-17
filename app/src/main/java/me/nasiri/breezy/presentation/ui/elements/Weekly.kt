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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.nasiri.breezy.R


@Composable
fun Weekly(/*todo get state*/) {

    Column(verticalArrangement = Arrangement.spacedBy(18.dp)) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.weekly_forecast),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Icon(// hint: 3*height == width
                modifier = Modifier.size(width = 45.dp, height = 15.dp),
                painter = painterResource(id = R.drawable.ic_arrow),
                contentDescription = null
            )
        }

        LazyRow {
            /*todo fix item count*/
            items(7) {
                WeeklyItem()
                Spacer(modifier = Modifier.width(12.dp))
            }
        }
    }
}

@Composable
fun WeeklyItem(/*todo get state*/) {
    Column(
        modifier = Modifier
            .border(2.dp, Color.Black, RoundedCornerShape(12.dp))
            .padding(horizontal = 10.dp, vertical = 14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = stringResource(id = R.string.sp_centigrade), fontWeight = FontWeight.Bold)
        Icon(imageVector = Icons.Default.Star, contentDescription = null)
        Text(text = stringResource(id = R.string.sp_time))
    }
}

@Preview(showBackground = true)
@Composable
fun WeeklyPreview() {
    Weekly()
}