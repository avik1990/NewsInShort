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
}