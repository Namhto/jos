plugins {
    id("application")
    id("org.openjfx.javafxplugin").version("0.0.8")
}

group = "com.namhto"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    testImplementation("org.assertj:assertj-core:3.15.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_14
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

javafx {
    version = "14"
    modules = listOf("javafx.controls", "javafx.fxml")
}

application {
    mainClassName = "com.namhto.jos.EntryPoint"
}