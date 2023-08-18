plugins {
    kotlin("jvm") version "1.9.0"
//    id("org.jetbrains.compose") version "1.4.3"
    id("org.jetbrains.compose") version "1.5.0-rc01"
}

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

dependencies {
    implementation(compose.desktop.currentOs)
}