plugins {
    id("paypal.android.library")
    id("paypal.android.hilt")
    id("kotlinx-serialization")
}

android {
    namespace = "com.saeed.paypal.core.data"
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))
    implementation(project(":core:network"))

    implementation(libs.androidx.core.ktx)

    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
}