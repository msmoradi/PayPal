package com.saeed.paypal.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saeed.paypal.core.designsystem.R
import com.saeed.paypal.core.designsystem.theme.PayPalTheme

@Composable
fun RoundedBackgroundIcon(
    iconResId: Int,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = CircleShape
            )
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            tint = MaterialTheme.colorScheme.onSurface,
            contentDescription = "action icon"
        )
    }
}

@Preview
@Composable
fun RoundedBackGroundIconPreview() {
    PayPalTheme {
        RoundedBackgroundIcon(iconResId = R.drawable.ic_contacts)
    }
}