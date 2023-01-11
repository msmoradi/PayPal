package com.saeed.paypal.core.data.repository

import com.saeed.paypal.core.model.ActivityModel
import kotlinx.coroutines.flow.Flow

interface ActivitiesRepository {

    fun getActivities(): Flow<List<ActivityModel>>
}
