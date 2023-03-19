import com.manudev.cleanbasearch.gradle.AndroidSdk.COMPILE_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.AndroidSdk.MIN_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.AndroidSdk.TARGET_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.Constants.KOTLIN_JVM_TARGET
import com.manudev.cleanbasearch.gradle.Libraries.appCompat
import com.manudev.cleanbasearch.gradle.Libraries.espresso
import com.manudev.cleanbasearch.gradle.Libraries.gson
import com.manudev.cleanbasearch.gradle.Libraries.hilt_dependency
import com.manudev.cleanbasearch.gradle.Libraries.hilt_kapt
import com.manudev.cleanbasearch.gradle.Libraries.junit4
import com.manudev.cleanbasearch.gradle.Libraries.junit_impl
import com.manudev.cleanbasearch.gradle.Libraries.ktxCore
import com.manudev.cleanbasearch.gradle.Libraries.material
import com.manudev.cleanbasearch.gradle.Libraries.retrofit

plugins {
    id("android.lib.plugin")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "es.manudev.data"
    compileSdk = COMPILE_ANDROID_VERSION

    defaultConfig {
        minSdk = MIN_ANDROID_VERSION
        targetSdk = TARGET_ANDROID_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = KOTLIN_JVM_TARGET
    }
}

dependencies {
    implementation(project(":domain"))

    implementation(ktxCore)
    implementation(appCompat)
    implementation(material)

    testImplementation(junit4)
    androidTestImplementation(junit_impl)
    androidTestImplementation(espresso)

    implementation(retrofit)
    implementation(gson)

    implementation(hilt_dependency)
    kapt(hilt_kapt)
}
