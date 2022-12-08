package com.saeed.paypal.model

data class ActivityModel(
    val title: String,
    val time: String,
    val amount: String,
    val amountState: AmountStatus,
    val imageUrl: String
)

enum class AmountStatus {
    POSITIVE,
    NEGATIVE
}

val previewActivities = listOf(
    ActivityModel(
        title = "Apple Store",
        time = "Yesterday at 11:45 AM",
        amount = "-\$250",
        amountState = AmountStatus.NEGATIVE,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fa/Apple_logo_black.svg/1280px-Apple_logo_black.svg.png"
    ),
    ActivityModel(
        title = "Amazon.com",
        time = "Yesterday at 6:28 PM",
        amount = "+\$450",
        amountState = AmountStatus.POSITIVE,
        imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a9/Amazon_logo.svg/2880px-Amazon_logo.svg.png"
    )

)