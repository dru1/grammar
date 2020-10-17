plugins {
    java
//    antlr
}

group = "at.dru.grammar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Plugin ANTLR version 4
//    antlr("org.antlr:antlr4:4.8-1")
    implementation("org.antlr:antlr4-runtime:4.8-1")

    // Logging
    implementation("org.slf4j:slf4j-api:1.7.25")
    runtimeOnly("ch.qos.logback:logback-classic:1.2.3")

    // Utils
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.google.guava:guava:28.2-jre")
    implementation("org.apache.commons:commons-lang3:3.9")

    // Tests
    testImplementation("junit:junit:4.12")
}
