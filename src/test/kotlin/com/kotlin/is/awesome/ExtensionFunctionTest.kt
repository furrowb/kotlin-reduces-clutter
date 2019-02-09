package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaGetAndSet
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ExtensionFunctionTest: ShouldSpec() {
    init {
        should("Use extension functions for Java GetAndSet class") {
            // Needs to be MutableList so our function can modify it
            val javaGetAndSet = JavaGetAndSet(mutableListOf("Item1", "Item2"), emptyMap())
            javaGetAndSet.myList.size shouldBe 2

            // Removes the first element
            javaGetAndSet.myNewFunction()

            javaGetAndSet.myList.size shouldBe 1
            javaGetAndSet.myList.first() shouldBe "Item2"
        }

        should("Use extension functions for Kotlin GetAndSet class") {
            val kotlinGetAndSet = KotlinGetAndSet(mutableListOf("Item1", "Item2"), emptyMap())
            kotlinGetAndSet.myList.size shouldBe 2

            // Removes the first element
            kotlinGetAndSet.myNewFunction()

            kotlinGetAndSet.myList.size shouldBe 1
            kotlinGetAndSet.myList.first() shouldBe "Item2"
        }
    }
}

// Adding a new function that does not exist on the original class
fun JavaGetAndSet.myNewFunction() {
    this.myList.removeAt(0)
}

// Adding a new function that does not exist on the original class
fun KotlinGetAndSet.myNewFunction() {
    this.myList.removeAt(0)
}