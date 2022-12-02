package com.saeed.paypal.feature.contacts

import androidx.annotation.VisibleForTesting
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun ContactsRoute(
    modifier: Modifier = Modifier, viewModel: ContactsViewModel = hiltViewModel()
) {
    ContactsScreen(modifier = modifier)
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
internal fun ContactsScreen(
    modifier: Modifier = Modifier
) {
}
