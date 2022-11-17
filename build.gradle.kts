plugins {
    kotlin("jvm") version "1.6.21"
    antlr
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    antlr("org.antlr:antlr4:4.11.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test:$embeddedKotlinVersion")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$embeddedKotlinVersion")
    testImplementation("junit:junit:4.13.2")
}

tasks.named<AntlrTask>("generateGrammarSource").configure {
    arguments.addAll(listOf("-package", "antlrGeneratedSource", "-visitor", "-listener"))
    outputDirectory = File("src/main/java/antlrGeneratedSource")
}

tasks.named("compileKotlin").configure {
    dependsOn("generateGrammarSource")
}