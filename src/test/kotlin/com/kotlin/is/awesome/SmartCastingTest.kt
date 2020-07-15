package com.kotlin.`is`.awesome

import com.java.`is`.okay.LessSmartCasting
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class SmartCastingTest: ShouldSpec() {
    init {
        should("Use the (Java) less smart casting") {
            LessSmartCasting.convertToString(null) shouldBe "Well, it's null"
            LessSmartCasting.convertToString(5) shouldBe "5"
        }

        should("Use the smarter (Kotlin) casting") {
            SmartCasting.verySmart(null) shouldBe "It was null!"
            SmartCasting.verySmart(5) shouldBe "5"
        }
    }
}