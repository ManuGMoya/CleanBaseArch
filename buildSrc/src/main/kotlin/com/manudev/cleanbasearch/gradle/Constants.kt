package com.manudev.cleanbasearch.gradle

object Constants {
    const val APPLICATION_ID = "es.manudev.cleanbasearch"
    const val VERSION_NAME = "1.0"
    const val VERSION_CODE = 1

    const val KOTLIN_JVM_TARGET = "11"
}

object AndroidSdk {
    const val MIN_ANDROID_VERSION = 28
    const val COMPILE_ANDROID_VERSION = 33
    const val TARGET_ANDROID_VERSION = 33
}

object Libraries {
    private object Versions {

        // ANDROID_KTX
        const val ktx = "1.9.0"

        // ANDROID_X
        const val appCompat = "1.6.1"
        const val constraintLayout = "2.1.4"

        // MATERIAL
        const val material = "1.8.0"

        // DAGGER HILT
        const val hilt = "2.41"

        // COROUTINES
        const val coroutines = "1.6.4"

        // LIFECYCLE
        const val lifecycle = "2.5.1"

        // NAVIGATION
        const val navigation = "2.5.3"

        // RETROFIT
        const val retrofit = "2.9.0"

        // TEST
        const val junit4 = "4.13.2"
        const val junit_impl = "1.1.5"
        const val espresso = "3.5.1"
    }

    // ANDROID_KTX
    const val ktxCore = "androidx.core:core-ktx:${Versions.ktx}"

    // ANDROID_X
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // MATERIAL
    const val material = "com.google.android.material:material:${Versions.material}"

    // DAGGER HILT
    const val hilt_dependency = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hilt_kapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"

    // COROUTINES
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"

    // LIFECYCLE
    // ViewModel
    const val viewmodel_lifecycle =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    // Livedata
    const val livedate = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"

    // NAVIGATION
    const val navigation_fragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // RETROFIT
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    // TEST
    const val junit4 = "junit:junit:${Versions.junit4}"
    const val junit_impl = "androidx.test.ext:${Versions.junit_impl}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}
