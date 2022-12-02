package com.saeed.paypal.core.designsystem

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

object PayPalIcons {

    val Contacts = R.drawable.ic_contacts
    val Home = R.drawable.ic_home
    val Wallet = R.drawable.ic_wallet
    val Setting = R.drawable.ic_setting
}

sealed class Icon {

    data class ImageVectorIcon(val imageVector: ImageVector) : Icon()
    data class DrawableResourceIcon(@DrawableRes val id: Int) : Icon()
}
