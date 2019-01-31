package com.kotlin.`is`.awesome

class NullSafety(val cantBeNull: String, val mightBeNull: String?) {
    fun returnSubString(): String? = mightBeNull?.substring(0, 1)

    fun returnDefault() = mightBeNull ?: "This is the default"

    fun notNullAssertionOperator() = mightBeNull!!

    fun smartChecking(): String {
        // This is not Kotlin idiomatic code. Use an elvis operator instead
        return if(mightBeNull != null) {
            mightBeNull
        } else {
            "It was null"
        }
    }
}