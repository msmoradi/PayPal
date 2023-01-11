package com.google.samples.apps.nowinandroid.core.domain

import com.saeed.paypal.core.data.repository.ActivitiesRepository
import com.saeed.paypal.core.model.ActivityModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetActivitiesUseCase @Inject constructor(
    private val activitiesRepository: ActivitiesRepository,
) {

    operator fun invoke(): Flow<List<ActivityModel>> {
        return activitiesRepository.getActivities()
    }
}