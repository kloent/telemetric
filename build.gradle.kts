import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.compose") version "1.1.0"

}

group = "me.acer"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(compose.desktop.currentOs)
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "testDesktop"
            packageVersion = "1.0.0"
        }
        dependencies{
            implementation("com.fasterxml.jackson.core:jackson-annotations:2.14.2")
            //Retrofit for Rest and json converter
            implementation("com.squareup.retrofit2:retrofit:2.9.0")
            implementation("com.google.code.gson:gson:2.10.1")
            implementation("com.squareup.retrofit2:converter-gson:2.3.0")
            implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

            //Ldap and Jwt
            val ktorVersion = "2.2.3"
            implementation("io.ktor:ktor-client-core:$ktorVersion")
            implementation("io.ktor:ktor-client-cio:$ktorVersion")

            // Kafka
            implementation("org.apache.kafka:kafka-streams:3.4.0")
            testImplementation("org.apache.kafka:kafka-streams-test-utils:3.4.0")
            implementation("org.apache.kafka:kafka-clients:3.4.0")
            testImplementation("org.apache.kafka:kafka-streams-test-utils:3.4.0")

            //Dagger
            val daggerVersion = "2.0"

            implementation("com.google.dagger:dagger:$daggerVersion")
            runtimeOnly("org.jetbrains.kotlin:kotlin-annotation-processing-gradle:1.6.10")

        }
    }
}