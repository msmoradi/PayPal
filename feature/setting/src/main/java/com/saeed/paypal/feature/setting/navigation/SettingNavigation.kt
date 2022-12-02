package com.saeed.paypal.feature.setting.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.saeed.paypal.feature.setting.SettingRoute

const val settingRoute = "setting_route"

fun NavController.navigateToSetting(navOptions: NavOptions? = null) {
    this.navigate(settingRoute, navOptions)
}

fun NavGraphBuilder.settingScreen() {
    composable(route = settingRoute) {
        SettingRoute()
    }
}