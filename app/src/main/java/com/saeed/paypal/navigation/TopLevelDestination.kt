package com.saeed.paypal.navigation

import com.saeed.paypal.R
import com.saeed.paypal.core.designsystem.Icon
import com.saeed.paypal.core.designsystem.PayPalIcons

enum class TopLevelDestination(
    val icon: Icon,
    val iconTextId: Int,
    val titleTextId: Int
) {

    HOME(
        icon = Icon.DrawableResourceIcon(PayPalIcons.Home),
        iconTextId = R.string.home_title,
        titleTextId = R.string.home_title
    ),
    CONTACTS(
        icon = Icon.DrawableResourceIcon(PayPalIcons.Contacts),
        iconTextId = R.string.contacts_title,
        titleTextId = R.string.contacts_title
    ),
    WALLET(
        icon = Icon.DrawableResourceIcon(PayPalIcons.Wallet),
        iconTextId = R.string.wallet_title,
        titleTextId = R.string.wallet_title
    ),
    SETTING(
        icon = Icon.DrawableResourceIcon(PayPalIcons.Setting),
        iconTextId = R.string.setting_title,
        titleTextId = R.string.setting_title
    )
}
