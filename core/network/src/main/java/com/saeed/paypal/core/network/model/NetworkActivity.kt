package com.saeed.paypal.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkActivity(
    val title: String = "",
    val time: String = "",
    val amount: String = "",
    val amountState: Int = 0,
    val imageUrl: String = ""
)
