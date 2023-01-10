package com.saeed.paypal.feature.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.ui.DevicePreviews
import com.saeed.paypal.model.ActivityModel
import com.saeed.paypal.model.AmountStatus
import com.saeed.paypal.model.previewActivities

@Composable
fun ActivityRow(
    activityModel: ActivityModel,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Image(
            painter = rememberAsyncImagePainter(activityModel.imageUrl),
            contentDescription = null,
            modifier = Modifier.size(32.dp)
        )
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(2.dp),
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = activityModel.title,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.onBackground
            )
            Text(
                text = activityModel.time,
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
        Text(
            text = activityModel.amount,
            style = MaterialTheme.typography.titleMedium,
            color = amountColor(activityModel.amountState)
        )
    }
}

fun amountColor(amountState: AmountStatus): Color {
    return when (amountState) {
        AmountStatus.POSITIVE -> Green
        AmountStatus.NEGATIVE -> Red
    }
}

@DevicePreviews
@Composable
fun ActivityRowPreview() {
    PayPalTheme {
        ActivityRow(previewActivities.first())
    }
}


