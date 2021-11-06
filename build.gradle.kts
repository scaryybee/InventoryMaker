plugins {
    kotlin("jvm") version "1.5.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(16))
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://jitpack.io/")
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")

    testImplementation(kotlin("stdlib"))
    testCompileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")
    testImplementation("com.github.AtSignRANK:MAP:0.2.2")
}