plugins {
    id("paypal.android.library")
    id("paypal.android.library.compose")
}

android {
    namespace = "com.saeed.paypal.core.ui"
}

dependencies {
    implementation(project(":core:designsystem"))
}
