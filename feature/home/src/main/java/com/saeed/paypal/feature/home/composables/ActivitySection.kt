package com.saeed.paypal.feature.home.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.ui.DevicePreviews
import com.saeed.paypal.model.ActivityModel
import com.saeed.paypal.model.previewActivities

@Composable
fun ActivitySection(
    items: List<ActivityModel>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Activity")
                Text(text = "View All")
            }
        }
        items(items = items) {
            ActivityRow(activityModel = it)
        }
    }
}

@DevicePreviews
@Composable
fun ActivitySectionPreview() {
    PayPalTheme {
        ActivitySection(previewActivities)
    }
}