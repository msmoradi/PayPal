plugins {
    id("paypal.android.feature")
    id("paypal.android.library.compose")
}

android {
    namespace = "com.saeed.paypal.feature.home"
}

dependencies {
    implementation(project(":core:designsystem"))
    implementation(project(":core:ui"))
    implementation(libs.androidx.compose.material3.windowSizeClass)
}