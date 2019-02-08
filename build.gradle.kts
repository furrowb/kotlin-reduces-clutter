import org.gradle.api.internal.tasks.testing.DecoratingTestDescriptor
import org.gradle.api.tasks.testing.logging.TestExceptionFormat

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */
plugins{
    id("java")
    kotlin("jvm").version("1.3.21")
}

repositories {
    jcenter()

}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.2.1")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform { }
    testLogging {
        exceptionFormat = TestExceptionFormat.FULL
        showStandardStreams = true
    }
}