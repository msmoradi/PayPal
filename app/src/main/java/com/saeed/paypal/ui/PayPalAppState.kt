package com.saeed.paypal.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.util.trace
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.saeed.paypal.feature.contacts.navigation.contactsRoute
import com.saeed.paypal.feature.contacts.navigation.navigateToContacts
import com.saeed.paypal.feature.home.navigation.homeRoute
import com.saeed.paypal.feature.home.navigation.navigateToHome
import com.saeed.paypal.feature.setting.navigation.navigateToSetting
import com.saeed.paypal.feature.setting.navigation.settingRoute
import com.saeed.paypal.feature.wallet.navigation.navigateToWallet
import com.saeed.paypal.feature.wallet.navigation.walletRoute
import com.saeed.paypal.navigation.TopLevelDestination
import com.saeed.paypal.navigation.TopLevelDestination.CONTACTS
import com.saeed.paypal.navigation.TopLevelDestination.HOME
import com.saeed.paypal.navigation.TopLevelDestination.SETTING
import com.saeed.paypal.navigation.TopLevelDestination.WALLET

@Composable
fun rememberPayPalAppState(
    navController: NavHostController = rememberNavController()
): PayPalAppState {
    return remember(navController) {
        PayPalAppState(navController)
    }
}

@Stable
class PayPalAppState(
    val navController: NavHostController
) {

    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val currentTopLevelDestination: TopLevelDestination?
        @Composable get() = when (currentDestination?.route) {
            settingRoute -> SETTING
            walletRoute -> WALLET
            contactsRoute -> CONTACTS
            homeRoute -> HOME
            else -> null
        }

    /**
     * Map of top level destinations to be used in the TopBar, BottomBar and NavRail. The key is the
     * route.
     */
    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()

    /**
     * UI logic for navigating to a top level destination in the app. Top level destinations have
     * only one copy of the destination of the back stack, and save and restore state whenever you
     * navigate to and from it.
     *
     * @param topLevelDestination: The destination the app needs to navigate to.
     */
    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        trace("Navigation: ${topLevelDestination.name}") {
            val topLevelNavOptions = navOptions {
                // Pop up to the start destination of the graph to
                // avoid building up a large stack of destinations
                // on the back stack as users select items
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                // Avoid multiple copies of the same destination when
                // reselecting the same item
                launchSingleTop = true
                // Restore state when reselecting a previously selected item
                restoreState = true
            }

            when (topLevelDestination) {
                HOME -> navController.navigateToHome(topLevelNavOptions)
                SETTING -> navController.navigateToSetting(topLevelNavOptions)
                CONTACTS -> navController.navigateToContacts(topLevelNavOptions)
                WALLET -> navController.navigateToWallet(topLevelNavOptions)
            }
        }
    }

    fun onBackClick() {
        navController.popBackStack()
    }
}