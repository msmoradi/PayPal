package com.saeed.paypal.core.network.model

import kotlinx.serialization.Serializable

@Serializable
data class NetworkContact(
    val name: String = "",
    val email: String = ""
)