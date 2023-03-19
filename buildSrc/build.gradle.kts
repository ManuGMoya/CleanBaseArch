plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.2.2")
    implementation(kotlin("gradle-plugin", version = "1.6.0"))
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.41")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3")
}
