package com.saeed.paypal.feature.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.saeed.paypal.core.designsystem.R
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.model.ActivityModel
import com.saeed.paypal.core.model.previewActivities
import com.saeed.paypal.core.ui.DevicePreviews

@Composable
fun HomeContent(
    activities: List<ActivityModel>,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .background(color = MaterialTheme.colorScheme.primary)
                .padding(32.dp)
        ) {
            HomeAppBar()
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .padding(horizontal = 32.dp, vertical = 24.dp)
                .fillMaxWidth()
                .height(140.dp)
        ) {
            ActionItem(
                modifier = Modifier.weight(3f),
                iconResId = R.drawable.ic_send_money,
                text = "Send Money",
                contentColor = MaterialTheme.colorScheme.background,
                backgroundColors = listOf(
                    Color(0xFF0070BA), MaterialTheme.colorScheme.primary
                ),
                onItemClicked = {}
            )
            ActionItem(
                modifier = Modifier.weight(3f),
                iconResId = R.drawable.ic_request_money,
                text = "Request Money",
                contentColor = MaterialTheme.colorScheme.primary,
                backgroundColors = listOf(
                    MaterialTheme.colorScheme.background,
                    MaterialTheme.colorScheme.background
                ),
                onItemClicked = {}
            )
            MoreActionItem(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
            )
        }
        ActivitySection(
            activities,
            modifier = Modifier
                .padding(horizontal = 32.dp, vertical = 24.dp)
                .fillMaxWidth()
        )
    }
}

@DevicePreviews
@Composable
fun HomeContentPreview() {
    PayPalTheme {
        HomeContent(
            activities = previewActivities
        )
    }
}