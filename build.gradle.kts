buildscript {
    extra.apply{
        set("compose_version", "1.5.8")
    }
    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.48")
    }
}

plugins {
    id("com.android.application") version "8.11.1" apply false
    id("com.android.library") version "8.11.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
}