package com.saeed.paypal.core.model

data class ContactModel(
    val name: String,
    val email: String
)

val previewContacts = listOf(
    ContactModel(
        name = "Andrew Dillan",
        email = "andrew.dillan@gmail.com"
    ),
    ContactModel(
        name = "Alex Millton",
        email = "alxmillton@yahoo.com"
    ),
    ContactModel(
        name = "Don Norman",
        email = "don.norman@gmail.com"
    ),
    ContactModel(
        name = "Mike Rine",
        email = "mikerine@gmail.com"
    )
)