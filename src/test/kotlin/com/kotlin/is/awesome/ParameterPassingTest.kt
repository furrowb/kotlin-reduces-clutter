package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaParameters
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ParameterPassingTest: ShouldSpec() {
    init {
        should("Use Java's verbose parameter passing with builder pattern") {
            val javaParameters = JavaParameters()
                .firstSetting("First")
                .secondSetting("Second")
                .thirdSetting("Third")

            with(javaParameters) {
                first shouldBe "First"
                second shouldBe "Second"
                third shouldBe "Third"
            }
        }

        should("Use Java's verbose parameter passing but with Kotlin scope functions") {
            val javaParameters = JavaParameters().apply {
                setParameters("First one!", "Second One!", "Still have to set the third one")
                firstSetting("First")
                secondSetting("Second")
                thirdSetting("Third")
            }

            with(javaParameters) {
                first shouldBe "First"
                second shouldBe "Second"
                third shouldBe "Third"
            }
        }

        should("Use Kotlin's scope functions") {
            val kotlinParameters = KotlinParameters().apply {
                firstSetting = "First"
                secondSetting = "Second"
                thirdSetting = "Third"
            }

            with(kotlinParameters) {
                firstSetting shouldBe "First"
                secondSetting shouldBe "Second"
                thirdSetting shouldBe "Third"
            }
        }

        should("Use Kotlin's named parameters") {
            val kotlinParameters = KotlinParameters()
            kotlinParameters.setParams(firstSetting = "First", secondSetting = "Second")

            with(kotlinParameters) {
                firstSetting shouldBe "First"
                secondSetting shouldBe "Second"
                thirdSetting shouldBe "Default"
            }
        }
    }
}