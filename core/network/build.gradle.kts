plugins {
    id("paypal.android.library")
    id("paypal.android.hilt")
    id("kotlinx-serialization")
}

android {
    buildFeatures {
        buildConfig = true
    }
    namespace = "com.saeed.paypal.core.network"
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }
}

dependencies {
    implementation(project(":core:common"))
    implementation(project(":core:model"))

    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.datetime)

    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)
}
