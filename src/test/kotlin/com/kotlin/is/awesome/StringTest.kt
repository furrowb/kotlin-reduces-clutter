package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaString
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class StringTest: ShouldSpec() {
    init {
        should("Use Java's String building") {
            val javaString = JavaString("first", "second")

            javaString.combinedStringViaConcatenation shouldBe "first second"
            javaString.combinedStringViaStringBuilder shouldBe "first second"
        }

        should("Use Kotlin's String interpolation") {
            val kotlinString = KotlinString("first", "second")

            kotlinString.combinedString() shouldBe "first second"
        }
    }
}