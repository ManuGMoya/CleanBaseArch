import com.manudev.cleanbasearch.gradle.AndroidSdk.COMPILE_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.AndroidSdk.MIN_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.AndroidSdk.TARGET_ANDROID_VERSION
import com.manudev.cleanbasearch.gradle.Constants.APPLICATION_ID
import com.manudev.cleanbasearch.gradle.Constants.KOTLIN_JVM_TARGET
import com.manudev.cleanbasearch.gradle.Constants.VERSION_CODE
import com.manudev.cleanbasearch.gradle.Constants.VERSION_NAME
import com.manudev.cleanbasearch.gradle.Libraries.appCompat
import com.manudev.cleanbasearch.gradle.Libraries.constraintLayout
import com.manudev.cleanbasearch.gradle.Libraries.espresso
import com.manudev.cleanbasearch.gradle.Libraries.hilt_dependency
import com.manudev.cleanbasearch.gradle.Libraries.hilt_kapt
import com.manudev.cleanbasearch.gradle.Libraries.junit4
import com.manudev.cleanbasearch.gradle.Libraries.junit_impl
import com.manudev.cleanbasearch.gradle.Libraries.ktxCore
import com.manudev.cleanbasearch.gradle.Libraries.material

plugins {
    id("android.app.plugin")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
    kotlin("kapt")
}

android {
    compileSdk = COMPILE_ANDROID_VERSION

    defaultConfig {
        applicationId = APPLICATION_ID

        minSdk = MIN_ANDROID_VERSION
        targetSdk = TARGET_ANDROID_VERSION

        versionName = VERSION_NAME
        versionCode = VERSION_CODE

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    implementation(project(":presentation"))
    implementation(project(":domain"))
    implementation(project(":data"))

    implementation(ktxCore)
    implementation(appCompat)
    implementation(material)

    testImplementation(junit4)
    androidTestImplementation(junit_impl)
    androidTestImplementation(espresso)

    implementation(constraintLayout)

    implementation(hilt_dependency)
    kapt(hilt_kapt)


}
