plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("net.datafaker:datafaker:2.5.4")
    implementation("com.github.lalyos:jfiglet:0.0.8")
    testImplementation("com.codeborne:selenide:7.17.0")
    testImplementation("io.cucumber:cucumber-java:7.34.4")
    testImplementation("io.cucumber:cucumber-junit-platform-engine:7.34.4")
    testImplementation ("org.junit.platform:junit-platform-suite:1.14.0")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<JavaExec>().configureEach {
    jvmArgs(
        "-Dfile.encoding=UTF-8",
        "-Dsun.stdout.encoding=UTF-8",
        "-Dsun.stderr.encoding=UTF-8"
    )
}

