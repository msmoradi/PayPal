package com.saeed.paypal.core.network

import com.saeed.paypal.core.network.model.NetworkChangeList
import com.saeed.paypal.core.network.model.NetworkNewsResource
import com.saeed.paypal.core.network.model.NetworkTopic

interface PaypalNetworkDataSource {

    suspend fun getActivities(): List<NetworkActivity>
}
