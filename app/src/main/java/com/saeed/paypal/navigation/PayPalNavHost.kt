package com.saeed.paypal.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.saeed.paypal.feature.contacts.navigation.contactsScreen
import com.saeed.paypal.feature.home.navigation.homeRoute
import com.saeed.paypal.feature.home.navigation.homeScreen
import com.saeed.paypal.feature.setting.navigation.settingScreen
import com.saeed.paypal.feature.wallet.navigation.walletScreen

@Composable
fun PayPalNavHost(
    navController: NavHostController,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier,
    startDestination: String = homeRoute
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen()
        walletScreen()
        settingScreen()
        contactsScreen()
    }
}
