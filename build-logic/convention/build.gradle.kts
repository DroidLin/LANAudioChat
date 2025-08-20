import org.gradle.initialization.DependenciesAccessors
import org.gradle.kotlin.dsl.support.serviceOf
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

group = "my.lan.audio"

dependencies {

    compileOnly(libs.kotlin.multiplatform.gradle.tools)
    compileOnly(libs.compose.multiplatform.gradle.tools)
    compileOnly(libs.android.gradle.tools)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)

    // dependencies accessor
    gradle.serviceOf<DependenciesAccessors>()
        .classes
        .asFiles
        .forEach { compileOnly(files(it.absolutePath)) }
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_21
    }
}
