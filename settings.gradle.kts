@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        flatDir {
            dirs("lib")  // 指向 'lib' 目录
        }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "wireguard-android"

//include(":tunnel")
include(":ui")
