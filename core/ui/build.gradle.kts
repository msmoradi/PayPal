plugins {
    id("blackbank.android.library")
    id("blackbank.android.library.compose")
}

android {
    namespace = "com.saeed.blackbank.core.ui"
}

dependencies {
    implementation(project(":core:designsystem"))
}
