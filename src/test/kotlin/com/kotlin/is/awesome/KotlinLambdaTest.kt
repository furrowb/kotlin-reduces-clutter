package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaLambda
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class KotlinLambdaTest : ShouldSpec() {

    init {
        should("Use Java Lambda") {
            val javaLambda = JavaLambda<String>(listOf("One", "Two"))

            javaLambda.filter { list -> list.take(1) } shouldBe listOf("One")
        }

        should("Use Kotlin Lambda") {
            val kotlinLambda = KotlinLambda(listOf("One", "Two"))

            kotlinLambda.filter { list -> list.take(1) } shouldBe listOf("One")
        }
    }

}