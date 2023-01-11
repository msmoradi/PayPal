package com.saeed.paypal.core.network.model.util

import kotlinx.datetime.Instant
import kotlinx.datetime.toInstant
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind.STRING
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object InstantSerializer : KSerializer<Instant> {
    override fun deserialize(decoder: Decoder): Instant =
        decoder.decodeString().toInstant()

    override val descriptor: SerialDescriptor = PrimitiveSerialDescriptor(
        serialName = "Instant",
        kind = STRING
    )

    override fun serialize(encoder: Encoder, value: Instant) =
        encoder.encodeString(value.toString())
}
