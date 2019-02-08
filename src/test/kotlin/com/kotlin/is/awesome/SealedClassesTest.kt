package com.kotlin.`is`.awesome

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class SealedClassesTest: ShouldSpec() {
    init {
        should("Showcase a case statement with sealed classes") {
            val sealedClass = createLackOfValue()

            val result = returnValue(sealedClass)

            result shouldBe "We have no value"
        }
    }

    private fun createTwoStringValue(field1: String, field2: String): SealedClasses
        = TwoStringValue(field1, field2)

    private fun createOneStringValue(field: String): SealedClasses = OneStringValue(field)

    private fun createLackOfValue(): SealedClasses = LackOfValue("We have no value")

    private fun returnValue(sealedClass: SealedClasses) = when(sealedClass) {
        is TwoStringValue -> sealedClass.combineFields()
        is OneStringValue -> sealedClass.field1
        is LackOfValue -> sealedClass.message
    }
}