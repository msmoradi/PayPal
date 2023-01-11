package com.saeed.paypal.core.network.fake

import JvmUnitTestFakeAssetManager
import com.saeed.paypal.core.network.Dispatcher
import com.saeed.paypal.core.network.PaypalDispatchers.IO
import com.saeed.paypal.core.network.PaypalNetworkDataSource
import com.saeed.paypal.core.network.model.NetworkChangeList
import com.saeed.paypal.core.network.model.NetworkNewsResource
import com.saeed.paypal.core.network.model.NetworkTopic
import javax.inject.Inject
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream

class FakePaypalNetworkDataSource @Inject constructor(
    @Dispatcher(IO) private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json,
    private val assets: FakeAssetManager = JvmUnitTestFakeAssetManager,
) : PaypalNetworkDataSource {

    companion object {

        private const val ACTIVITIES_ASSET = "activities.json"

    }

    @OptIn(ExperimentalSerializationApi::class)
    override suspend fun getActivities(): List<NetworkActivity> =
        withContext(ioDispatcher) {
            assets.open(ACTIVITIES_ASSET).use(networkJson::decodeFromStream)
        }

}