plugins {
    id("java")
    id("maven-publish")
}

group = "mega.trace"
version = "1.2.0"

java.toolchain.languageVersion.set(JavaLanguageVersion.of(8))

java {
    withSourcesJar()
}

tasks.jar {
    archiveBaseName.set("megatraceservice")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "mega"
            artifactId = "megatraceservice"
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "mega"
            setUrl("https://mvn.falsepattern.com/gtmega_releases")
            credentials(PasswordCredentials::class)
        }
    }
}