import com.manudev.cleanbasearch.gradle.AndroidSdk.COMPILE_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.AndroidSdk.MIN_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.AndroidSdk.TARGET_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.Constants.KOTLIN_JVM_TARGET
import com.manudev.cleanbasearch.gradle.Libraries.hilt_dependency
import com.manudev.cleanbasearch.gradle.Libraries.hilt_kapt

plugins {
    id("android.lib.plugin")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    namespace = "es.manudev.domain"
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
    implementation(hilt_dependency)
    kapt(hilt_kapt)
}
