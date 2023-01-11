package com.saeed.paypal.feature.home

import androidx.annotation.VisibleForTesting
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.ExperimentalLifecycleComposeApi
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.saeed.paypal.core.designsystem.component.LoadingWheel
import com.saeed.paypal.core.designsystem.theme.PayPalTheme
import com.saeed.paypal.core.model.previewActivities
import com.saeed.paypal.core.ui.DevicePreviews
import com.saeed.paypal.feature.home.composables.HomeContent

@OptIn(ExperimentalLifecycleComposeApi::class)
@Composable
internal fun HomeRoute(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val homeUiState by viewModel.homeUiState.collectAsStateWithLifecycle()

    HomeScreen(
        homeUiState = homeUiState,
        modifier = modifier
    )
}

@VisibleForTesting(otherwise = VisibleForTesting.PRIVATE)
@Composable
internal fun HomeScreen(
    homeUiState: HomeUiState,
    modifier: Modifier = Modifier
) {

    when (homeUiState) {
        HomeUiState.Error -> {}
        HomeUiState.Loading -> {
            LoadingWheel(
                modifier = modifier,
                contentDesc = "Loading"
            )
        }
        is HomeUiState.Success -> {
            HomeContent(
                activities = homeUiState.activities,
                modifier = modifier
            )
        }
    }
}

@DevicePreviews
@Composable
fun HomeScreenPreview() {
    PayPalTheme {
        HomeScreen(
            homeUiState = HomeUiState.Success(previewActivities)
        )
    }
}