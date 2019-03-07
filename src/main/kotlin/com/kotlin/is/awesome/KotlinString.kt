package com.kotlin.`is`.awesome

class KotlinString(item1: String, item2: String) {
    private var combinedString: String

    init {
        combinedString = "$item1 $item2"
    }

    fun combinedString() = combinedString
}