package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaParameters
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ParameterPassingTest: ShouldSpec() {
    init {
        should("Use Java's parameter passing with builder") {
            val javaParameters = JavaParameters()
            javaParameters.firstSetting("First")
            javaParameters.secondSetting("Second")
            javaParameters.thirdSetting("Third")

            javaParameters.also {
                it.firstSetting shouldBe "First"
                it.secondSetting shouldBe "Second"
                it.thirdSetting shouldBe "Third"
            }
        }

        should("Use Java's parameter passing sluggishly but with Kotlin scope functions") {
            // Apply is one of Kotlin's Scope functions that work on any object
            val javaParameters = JavaParameters().apply {
                this.setParameters("First one!", "Second One!", "Still have to set the third one")
                this.firstSetting("First")
                this.secondSetting("Second")
                this.thirdSetting("Third")
            }

            javaParameters.also {
                it.firstSetting shouldBe "First"
                it.secondSetting shouldBe "Second"
                it.thirdSetting shouldBe "Third"
            }
        }

        should("Use Kotlin's scope functions") {
            val kotlinParameters = KotlinParameters().also {
                it.firstSetting = "First"
                it.secondSetting = "Second"
                it.thirdSetting = "Third"
            }

            kotlinParameters.also {
                it.firstSetting shouldBe "First"
                it.secondSetting shouldBe "Second"
                it.thirdSetting shouldBe "Third"
            }
        }
    }
}