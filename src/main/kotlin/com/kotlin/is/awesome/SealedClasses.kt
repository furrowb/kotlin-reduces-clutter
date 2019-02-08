package com.kotlin.`is`.awesome

// Sealed classes are like an extended Enum class.
// Each subclass can have its own functions/values while still being part of the sealed class.
sealed class SealedClasses(val requiredField: String)

// We'll use this to show a return type that is missing a value
data class LackOfValue(val message: String): SealedClasses("LackOfValue Subclass")

// A class that will hold 2 strings and provide an operation on them
class TwoStringValue(private val field1: String, private val field2: String): SealedClasses("TwoStringValue Subclass") {
    fun combineFields() = "$field1 $field2"
}

// A class that only holds one string
class OneStringValue(val field1: String): SealedClasses("OneStringValue Subclass")