object Dependencies {
    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifecycleRuntimektx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntimektx}" }

    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeBom by lazy { "androidx.compose:compose-bom:${Versions.composeBom}" }
    val composeUi by lazy { "androidx.compose.ui:ui" }
    val composeiUiGraphics by lazy { "androidx.compose.ui:ui-graphics" }
    val composeMaterial by lazy { "androidx.compose.material3:material3" }

    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling" }
    val composeiUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview" }

    val composeTestManifest by lazy { "androidx.compose.ui:ui-test-manifest:" }

    val lifecycleViewmodelKtx by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewmodelKtx}" }
    val navVersion by lazy { "androidx.navigation:navigation-compose:${Versions.nav_version}" }

    val junit by lazy { "junit:junit:${Versions.junit}" }
    val extTestJunit by lazy { "androidx.test.ext:junit:${Versions.extTestJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espressoCore}" }
    val composeUiTest by lazy { "androidx.compose.ui:ui-test-junit4" }

    val appcompat by lazy { "androidx.appcompat:appcompat:${Versions.appcompat}"}
    val material by lazy { "com.google.android.material:material:${Versions.material}"}

    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hilt}"}
    val hiltCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hilt}"}

    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }
    val navigationCompose by lazy { "androidx.navigation:navigation-compose:${Versions.navigationCompose}" }

    val coil by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val gsonConnverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}" }
    val okHttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.retrofit}" }
    val loggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}" }

    val moshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.moshi}" }
    val moshiConverter by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }


    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }

    val splashscreenCore by lazy { "androidx.core:core-splashscreen:${Versions.splashVersion}" }
}

object Modules{
    const val utilities = ":utilities"
}