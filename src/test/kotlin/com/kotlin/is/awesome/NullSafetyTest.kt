package com.kotlin.`is`.awesome

import com.java.`is`.okay.LackOfNullSafety
import io.kotlintest.shouldBe
import io.kotlintest.shouldThrow
import io.kotlintest.specs.ShouldSpec
import java.lang.NullPointerException

class NullSafetyTest: ShouldSpec() {
    init {
        should("Be null even though we don't want it to be") {
            val lackOfNullSafety = LackOfNullSafety(null)

            lackOfNullSafety.maybeNull shouldBe null
            lackOfNullSafety.maybeNull?.contains("Null")?.and(false)?.not() shouldBe null
        }

        should("Won't even compile with null") {
            //val cantBeNull = NullSafety(null, null)
            val nullSafety = NullSafety("Not null", null)

            nullSafety.cantBeNull shouldBe "Not null"
            //nullSafety.mightBeNull.contains("Hi")
        }

        should("Use the elvis operator") {
            val nullSafety = NullSafety("Not null", null)
            nullSafety.mightBeNull shouldBe null

            val nullResult = nullSafety.mightBeNull ?: "Well, it's null"
            nullResult shouldBe "Well, it's null"
        }

        should("Not null assertion operator") {
            val nullSafety = NullSafety("Not null", null)

            nullSafety.mightBeNull shouldBe null
            shouldThrow<NullPointerException> {
                nullSafety.notNullAssertionOperator()
            }
        }
    }
}