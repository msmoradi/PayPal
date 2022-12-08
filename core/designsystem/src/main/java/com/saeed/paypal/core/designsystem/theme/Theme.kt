package com.saeed.paypal.core.designsystem.theme

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Light default theme color scheme
 */
@VisibleForTesting
val LightDefaultColorScheme = lightColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    error = Red,
    onError = Color.White,
    surface = Color.Gray,
    onSurface = Color.Black,
    background = Color.White,
    onBackground = Black
)

/**
 * Dark default theme color scheme
 */
@VisibleForTesting
val DarkDefaultColorScheme = darkColorScheme(
    primary = Blue,
    onPrimary = Color.White,
    error = Red,
    onError = Color.White,
    surface = Color.Gray,
    onSurface = Color.Black,
    background = Color.White,
    onBackground = Black
)

@Composable
fun PayPalTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkDefaultColorScheme
    } else {
        LightDefaultColorScheme
    }

    val defaultBackgroundTheme = BackgroundTheme(
        color = colorScheme.background,
        tonalElevation = 2.dp
    )

    CompositionLocalProvider(
        LocalBackgroundTheme provides defaultBackgroundTheme
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = PayPalTypography,
            content = content
        )
    }
}