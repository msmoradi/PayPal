package com.saeed.paypal.feature.home.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.saeed.paypal.core.designsystem.R
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.ui.DevicePreviews

@Composable
fun ActionItem(
    modifier: Modifier = Modifier,
    @DrawableRes iconResId: Int,
    text: String,
    contentColor: Color,
    backgroundColors: List<Color> = emptyList(),
    onItemClicked: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
            .fillMaxHeight()
            .background(
                shape = MaterialTheme.shapes.extraLarge,
                brush = Brush.radialGradient(
                    colors = backgroundColors,
                    center = Offset.Zero
                )
            )
            .clickable(onClick = onItemClicked)
            .padding(20.dp)
    ) {
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = null,
            tint = contentColor
        )
        Text(
            text = text,
            color = contentColor,
            overflow = TextOverflow.Clip
        )
    }
}

@DevicePreviews
@Composable
fun ActionItemPreview() {
    PayPalTheme {
        ActionItem(
            iconResId = R.drawable.ic_send_money,
            text = "Send Money",
            contentColor = MaterialTheme.colorScheme.background,
            backgroundColors = listOf(
                Color(0xFF0070BA), MaterialTheme.colorScheme.primary
            ),
            onItemClicked = {}
        )
    }
}