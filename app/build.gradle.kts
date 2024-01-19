plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.jraska.module.graph.assertion") version "2.5.0"
}

android {
    namespace = "br.com.jonathanarodr.modstrategy"
    compileSdk = 34

    defaultConfig {
        applicationId = "br.com.jonathanarodr.modstrategy"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.gson)

    implementation(projects.feature.featurePublic)
    implementation(projects.feature.featureImpl)
    implementation(projects.network.networkProvider)
    implementation(projects.network.networkExt)
}

moduleGraphAssert {
    maxHeight = 4
    assertOnAnyBuild = false
}
