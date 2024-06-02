import io.github.grassmc.waddle.settings.subproject

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.nguyenthanhtan.id.vn/releases")
    }
}

plugins {
    id("io.github.grassmc.waddle") version "2.0.0"
}

rootProject.name = "paper-plugin-template"

subproject(file("plugin"))
