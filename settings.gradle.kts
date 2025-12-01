pluginManagement {
    repositories {
        maven {
            name = "NeoForged"
            url = uri("https://maven.neoforged.net/releases")
        }
        maven {
            name = "ModPublisher"
            url = uri("https://maven.firstdarkdev.xyz/releases")
        }
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id ("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "Mekanism Pipez Fix"
