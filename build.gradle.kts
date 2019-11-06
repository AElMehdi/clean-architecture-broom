plugins {
    java
    application
}

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
}

dependencies {
    // Test
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.4.2")

    testImplementation("org.assertj:assertj-core:3.14.0")

    testImplementation("org.mockito:mockito-core:3.1.0")
    testCompile("org.mockito:mockito-junit-jupiter:3.1.0")
}

application {
    mainClassName = "com.aelmehdi.app.App"
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
}
