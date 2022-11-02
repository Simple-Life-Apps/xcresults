plugins {
    java
    id("com.palantir.graal") version("0.12.0")
}

group = "org.example"
version = "1.0-SNAPSHOT"

description = "Allure Server Java Client"

tasks.withType(Wrapper::class) {
    gradleVersion = "7.5"
}


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

graal {
    graalVersion(project.property("graalVersion") as String?)
    javaVersion("11")

    mainClass("io.eroshenkoam.xcresults.XCResults")
    outputName("xcresults")
}

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("info.picocli:picocli-codegen:4.1.4")

    implementation("com.fasterxml.jackson.core:jackson-databind:2.13.4.2")
    implementation("io.qameta.allure:allure-model:2.13.1")
    implementation("info.picocli:picocli:4.1.4")
    implementation("commons-io:commons-io:2.6")
    implementation("com.googlecode.json-simple:json-simple:1.1.1")


    testImplementation("junit:junit:4.12")
}
