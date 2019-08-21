package com.kotlin.`is`.awesome

import com.java.`is`.okay.JavaGetAndSet
import io.kotlintest.matchers.maps.shouldContain
import io.kotlintest.specs.ShouldSpec

class GetAndSetTest: ShouldSpec() {
    init {
        should("Get and Set things") {
            val java = JavaGetAndSet(
                mutableListOf("Java's", "Alright"), mutableMapOf(1 to "Java"))
            val kotlin = KotlinGetAndSet(
                mutableListOf("Kotlin's", "Cool"), mapOf(10 to "Kotlin"))

            // Setters
            java.myList = mutableListOf("New", "List")
            kotlin.myList = mutableListOf("New", "List")

            // Getters
            java.myMap.shouldContain(1, "Java")
            kotlin.myMap.shouldContain(10, "Kotlin")
        }
    }
}