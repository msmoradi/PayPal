package com.saeed.paypal.core.network.fake

import JvmUnitTestFakeAssetManager
import com.saeed.paypal.core.network.Dispatcher
import com.saeed.paypal.core.network.PayPalDispatchers.IO
import com.saeed.paypal.core.network.PaypalNetworkDataSource
import com.saeed.paypal.core.network.model.NetworkActivity
import com.saeed.paypal.core.network.model.NetworkContact
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import javax.inject.Inject

@OptIn(ExperimentalSerializationApi::class)
class FakePaypalNetworkDataSource @Inject constructor(
    @Dispatcher(IO) private val ioDispatcher: CoroutineDispatcher,
    private val networkJson: Json,
    private val assets: FakeAssetManager = JvmUnitTestFakeAssetManager,
) : PaypalNetworkDataSource {

    companion object {

        private const val ACTIVITIES_ASSET = "activities.json"
        private const val CONTACTS_ASSET = "contacts.json"
    }

    override suspend fun getActivities(): List<NetworkActivity> {
        return withContext(ioDispatcher) {
            assets.open(ACTIVITIES_ASSET).use(networkJson::decodeFromStream)
        }
    }

    override suspend fun getContacts(): List<NetworkContact> {
        return withContext(ioDispatcher){
            assets.open(CONTACTS_ASSET).use(networkJson::decodeFromStream)
        }
    }
}