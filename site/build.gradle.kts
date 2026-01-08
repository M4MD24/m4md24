import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "com.barmajaa.m4md24"
version = "V1.0"

kobweb {
    app {
        index {
            faviconPath.set("MohamedSadawy.png")
            description.set("Software Engineer / Android Apps Developer")
        }
    }
}

kotlin {
    configAsKobwebApplication("m4md24")

    sourceSets {
        jsMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.silk.icons.fa)
            // implementation(libs.kobwebx.markdown)
        }
    }
}
