package com.saeed.paypal.core.network

import javax.inject.Qualifier
import kotlin.annotation.AnnotationRetention.RUNTIME

@Qualifier
@Retention(RUNTIME)
annotation class Dispatcher(val dispatcher: PayPalDispatchers)

enum class PayPalDispatchers {
    IO
}