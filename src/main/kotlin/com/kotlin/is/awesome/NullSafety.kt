package com.kotlin.`is`.awesome

class NullSafety(val cantBeNull: String, val mightBeNull: String?) {
    // Anything with 'Type?' implies that the value COULD be null, and you will need to check it
    fun returnSubString(): String? = mightBeNull?.substring(0, 1)

    // Using the ?: here checks that if it's null, use the provided expression/value instead
    fun returnDefault() = mightBeNull ?: "This is the default"

    // Using !! means that we're ignoring the compiler warning and accept the consequences if this is null
    fun notNullAssertionOperator() = mightBeNull!!

    fun smartChecking(): String {
        // This is not idiomatic Kotlin code. Use an elvis operator instead:
        // return mightBeNull ?: "It was null"
        return if (mightBeNull != null) {
            mightBeNull
        } else {
            "It was null"
        }
    }
}