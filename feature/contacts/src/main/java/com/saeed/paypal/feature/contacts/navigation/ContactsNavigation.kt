package com.saeed.paypal.feature.contacts.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.saeed.paypal.feature.contacts.ContactsRoute

const val contactsRoute = "contacts_route"

fun NavController.navigateToContacts(navOptions: NavOptions? = null) {
    this.navigate(contactsRoute, navOptions)
}

fun NavGraphBuilder.contactsScreen() {
    composable(route = contactsRoute) {
        ContactsRoute()
    }
}