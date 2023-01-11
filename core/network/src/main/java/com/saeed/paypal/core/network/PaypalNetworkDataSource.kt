package com.saeed.paypal.core.network

import com.saeed.paypal.core.network.model.NetworkActivity

interface PaypalNetworkDataSource {

    suspend fun getActivities(): List<NetworkActivity>
}
