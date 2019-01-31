package com.kotlin.`is`.awesome

import io.kotlintest.matchers.maps.shouldContain
import io.kotlintest.specs.ShouldSpec

class GetAndSetTest: ShouldSpec() {
    init {
        should("Get and Set things") {
            val java = com.java.`is`.okay.GetAndSet(mutableListOf("Java's", "Alright"), mutableMapOf(1 to "Java"))
            val kotlin = com.kotlin.`is`.awesome.GetAndSet(mutableListOf("Kotlin's", "Cool"), mapOf(10 to "Kotlin"))

            java.myMap.shouldContain(1, "Java")
            kotlin.myMap.shouldContain(10, "Kotlin")
        }
    }
}