plugins {
    java
    antlr
}

group = "at.dru.grammar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Plugin ANTLR version 4
    antlr("org.antlr:antlr4:4.9.3")

    // Logging
    implementation("org.slf4j:slf4j-api:2.0.6")
    runtimeOnly("ch.qos.logback:logback-classic:1.3.5")

    // Utils
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    implementation("com.google.guava:guava:31.1-jre")
    implementation("org.apache.commons:commons-lang3:3.12.0")

    // Tests
    testImplementation("junit:junit:4.13.2")
}

tasks.generateGrammarSource {
    maxHeapSize = "64m"
    arguments = arguments + listOf("-visitor", "-long-messages")
}
