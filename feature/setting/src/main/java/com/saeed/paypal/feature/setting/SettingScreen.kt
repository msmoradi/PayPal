package com.saeed.paypal.feature.setting

import androidx.annotation.VisibleForTesting
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun SettingRoute(
    modifier: Modifier = Modifier, viewModel: SettingViewModel = hiltViewModel()
) {
    SettingScreen(modifier = modifier)
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
internal fun SettingScreen(
    modifier: Modifier = Modifier
) {
}
