package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaGetAndSet
import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

class ExtensionFunctionTest: ShouldSpec() {
    init {
        should("Use extension functions for GetAndSet classes") {
            // Needs to be MutableList so our function can modify it
            val javaGetAndSet = JavaGetAndSet(mutableListOf("Item1", "Item2"), mapOf())

            javaGetAndSet.myList.size shouldBe 2
            // Removes the first element
            javaGetAndSet.myNewFunction()

            javaGetAndSet.myList.size shouldBe 1
            javaGetAndSet.myList.first() shouldBe "Item2"
        }
    }
}

// Adding a new function that does not exist on the original class
fun JavaGetAndSet.myNewFunction() {
    this.myList.removeAt(0)
}