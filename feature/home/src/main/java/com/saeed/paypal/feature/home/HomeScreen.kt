package com.saeed.paypal.feature.home

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Check
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.ui.DevicePreviews

@Composable
internal fun HomeRoute(
    modifier: Modifier = Modifier, viewModel: HomeViewModel = hiltViewModel()
) {
    HomeScreen(modifier = modifier)
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
internal fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color = MaterialTheme.colorScheme.primary)
            .padding(32.dp)
    ) {
        HomeAppBar()
    }
}

@Composable
fun HomeAppBar(
    modifier: Modifier = Modifier
) {
    Column(
        modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .paddingFromBaseline(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(imageVector = Icons.Rounded.Check, contentDescription = null)
            Icon(imageVector = Icons.Rounded.Close, contentDescription = null)
        }

        Text(
            modifier = Modifier
                .paddingFromBaseline(top = 22.dp, bottom = 32.dp),
            text = "Hello, Vadim!",
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Text(
            text = "$ 272.30",
            style = MaterialTheme.typography.headlineLarge,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Text(
            modifier = Modifier.paddingFromBaseline(top = 4.dp),
            text = "Your Balance",
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@DevicePreviews
@Composable
fun HomeAppBarPreview() {
    PayPalTheme {
        HomeAppBar()
    }
}