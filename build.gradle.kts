plugins {
    id("java")
    id("maven-publish")
}

group = "mega.trace"
version = "1.0.0"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(8))

tasks.jar {
    archiveBaseName.set("megatraceservice")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            artifactId = "megatraceservice"
            from(components["java"])
        }
    }
    repositories {
        mavenLocal() //TODO: Actual maven publish
    }
}