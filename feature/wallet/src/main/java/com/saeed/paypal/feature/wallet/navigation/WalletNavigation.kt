package com.saeed.paypal.feature.wallet.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.saeed.paypal.feature.wallet.WalletRoute

const val walletRoute = "wallet_route"

fun NavController.navigateToWallet(navOptions: NavOptions? = null) {
    this.navigate(walletRoute, navOptions)
}

fun NavGraphBuilder.walletScreen() {
    composable(route = walletRoute) {
        WalletRoute()
    }
}
