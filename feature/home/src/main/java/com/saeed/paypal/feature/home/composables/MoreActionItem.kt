package com.saeed.paypal.feature.home.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.saeed.paypal.core.ui.DevicePreviews

@Composable
fun MoreActionItem(
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
            .background(
                shape = MaterialTheme.shapes.extraLarge,
                color = MaterialTheme.colorScheme.background
            )
    ) {
        Icon(
            imageVector = Icons.Rounded.MoreVert,
            contentDescription = "more",
            tint = MaterialTheme.colorScheme.onBackground
        )
    }
}

@DevicePreviews
@Composable
fun MoreActionItemPreviews() {
    MaterialTheme {
        MoreActionItem()
    }
}