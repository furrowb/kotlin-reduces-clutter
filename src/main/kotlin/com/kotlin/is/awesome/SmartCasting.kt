package com.kotlin.`is`.awesome

class SmartCasting {
    companion object {
        fun verySmart(something: Any?): String {
            // Switch statement is an expression
            // When using 'is', Kotlin knows to cast it
            // Using elvis operator (?) to check for null
            return when(something) {
                is String? -> something?.toString() ?: "It was null!"
                is Int -> something.toString()
                else -> something.toString()
            }
        }
    }
}