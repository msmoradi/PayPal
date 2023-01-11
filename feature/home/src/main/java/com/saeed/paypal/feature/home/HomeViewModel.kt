package com.saeed.paypal.feature.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.samples.apps.nowinandroid.core.domain.GetActivitiesUseCase
import com.saeed.paypal.core.model.ActivityModel
import com.saeed.paypal.core.result.Result
import com.saeed.paypal.core.result.asResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    getActivitiesUseCase: GetActivitiesUseCase
) : ViewModel() {

    val homeUiState: StateFlow<HomeUiState> = homeUiState(
        getActivitiesUseCase = getActivitiesUseCase
    )
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = HomeUiState.Loading
        )
}

private fun homeUiState(
    getActivitiesUseCase: GetActivitiesUseCase,
): Flow<HomeUiState> {
    return getActivitiesUseCase()
        .asResult()
        .map { result ->
            when (result) {
                is Result.Error -> {
                    HomeUiState.Error
                }
                Result.Loading -> {
                    HomeUiState.Loading
                }
                is Result.Success -> {
                    HomeUiState.Success(result.data)
                }
            }
        }
}

sealed interface HomeUiState {
    data class Success(val activities: List<ActivityModel>) : HomeUiState
    object Error : HomeUiState
    object Loading : HomeUiState
}