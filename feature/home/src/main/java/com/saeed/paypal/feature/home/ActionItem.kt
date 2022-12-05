package com.saeed.paypal.feature.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.unit.dp

@Composable
fun ActionItem(
    modifier: Modifier = Modifier,
    @DrawableRes iconResId: Int,
    text: String,
    contentColor: Color,
    backgroundColors: List<Color> = emptyList(),
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                shape = MaterialTheme.shapes.extraLarge,
                brush = Brush.radialGradient(
                    colors = backgroundColors,
                    center = Offset.Zero
                )
            )
            .padding(8.dp)
    ) {
        Column {
            Icon(
                painter = painterResource(id = iconResId),
                contentDescription = null,
                tint = contentColor
            )
            Text(
                text = text,
                color = contentColor
            )
        }
    }
}