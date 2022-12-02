package com.saeed.paypal.feature.wallet

import androidx.annotation.VisibleForTesting
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun WalletRoute(
    modifier: Modifier = Modifier, viewModel: WalletViewModel = hiltViewModel()
) {
    WalletScreen(modifier = modifier)
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
internal fun WalletScreen(
    modifier: Modifier = Modifier
) {
}
