plugins {
    id("paypal.android.library")
    id("paypal.android.hilt")
}

android {
    namespace = "com.saeed.paypal.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
}