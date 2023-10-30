plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.app.newsinshort"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.app.newsinshort"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntimektx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeiUiGraphics)
    implementation(Dependencies.composeiUiToolingPreview)
    implementation(Dependencies.composeMaterial)
    implementation(Dependencies.junit)
    implementation(Dependencies.extTestJunit)
    implementation(Dependencies.espressoCore)
    implementation(Dependencies.composeUiTest)
    implementation(Dependencies.composeUiTooling)
    implementation(Dependencies.composeTestManifest)
    implementation(Dependencies.lifecycleViewmodelKtx)

    implementation(project(Modules.utilities))

    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltCompiler)

    implementation(Dependencies.hiltNavigationCompose)
    implementation(Dependencies.navigationCompose)

    implementation(Dependencies.retrofit)
    implementation(Dependencies.gsonConnverter)
    implementation(Dependencies.okHttp)
    implementation(Dependencies.loggingInterceptor)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    
    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)

    implementation(Dependencies.splashscreenCore)

    implementation(Dependencies.coil)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}