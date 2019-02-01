package com.kotlin.`is`.awesome

class SmartCasting {
    companion object {
        fun verySmart(something: Any?): String {
            return when(something) {
                is String? -> something?.toString() ?: "It was null!"
                is String -> something.toString()
                is Int -> something.toString()
                else -> something.toString()
            }
        }
    }
}