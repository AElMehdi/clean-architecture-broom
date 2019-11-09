import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    java

    id("org.springframework.boot") version "2.2.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    // Spring boot
    implementation("org.springframework.boot:spring-boot-dependencies:2.2.1.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-web")

    // Test
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.2")

    testImplementation("org.assertj:assertj-core:3.14.0")

    testImplementation("org.mockito:mockito-core:3.1.0")
    testCompile("org.mockito:mockito-junit-jupiter:3.1.0")

    testCompile("org.springframework.boot:spring-boot-starter-test")
}


tasks.getting(BootJar::class) {
    mainClassName = "com.aelmehdi.footballstats.App"
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}

