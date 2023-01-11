package com.saeed.paypal.core.data.repository.fake

import com.saeed.paypal.core.data.repository.ActivitiesRepository
import com.saeed.paypal.core.model.ActivityModel
import com.saeed.paypal.core.model.AmountStatus
import com.saeed.paypal.core.network.Dispatcher
import com.saeed.paypal.core.network.PayPalDispatchers
import com.saeed.paypal.core.network.fake.FakePaypalNetworkDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class FakeActivitiesRepository @Inject constructor(
    @Dispatcher(PayPalDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val datasource: FakePaypalNetworkDataSource
) : ActivitiesRepository {

    override fun getActivities(): Flow<List<ActivityModel>> = flow {
        emit(
            datasource.getActivities().map {
                ActivityModel(
                    title = it.title,
                    time = it.time,
                    amount = it.amount,
                    amountState = AmountStatus.map(it.amountState),
                    imageUrl = it.imageUrl
                )
            }
        )
    }.flowOn(ioDispatcher)
}
