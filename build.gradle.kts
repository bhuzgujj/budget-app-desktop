import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
    application
    id("org.openjfx.javafxplugin") version "0.0.8"
}

group = "bhuzgujj"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

javafx {
    version = "11.0.2"
    modules = mutableListOf("javafx.controls", "javafx.graphics")
}

dependencies {
    implementation("no.tornado:tornadofx:1.7.20")
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:5.5.1")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}