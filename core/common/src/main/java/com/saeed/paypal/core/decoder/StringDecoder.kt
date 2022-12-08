package com.saeed.paypal.core.decoder

interface StringDecoder {
    fun decodeString(encodedString: String): String
}