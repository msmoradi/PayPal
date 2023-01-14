package com.saeed.paypal.core.network

import com.saeed.paypal.core.network.model.NetworkActivity
import com.saeed.paypal.core.network.model.NetworkContact

interface PaypalNetworkDataSource {

    suspend fun getActivities(): List<NetworkActivity>

    suspend fun getContacts(): List<NetworkContact>
}
