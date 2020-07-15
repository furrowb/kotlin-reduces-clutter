package com.kotlin.`is`.awesome

/**
 * Instead of having to specify the entire package path for a type, we can alias it.
 * For example, say there is a String class we want to use that isn't Java's default one.
 * If we wanted to use it, we'd have to specify to whole package name like below to ensure we don't use Java's version.
 * However, since we created the alias 'OurString', we can use our alias instead.
 */
typealias OurString = com.java.`is`.okay.JavaNoAliases.String

val ourString = OurString()

// Same goes for usage of generics
typealias OurClass = com.java.`is`.okay.JavaNoAliases.Klass<String>
typealias OurClassWithType<T> = com.java.`is`.okay.JavaNoAliases.Klass<T>

/**
 * We can use this HashMap as if it was a type declaration.
 * If we decide later to change this, we can just change the alias to a new type and not have to change our code.
 */
typealias SuperSpecializedMap = HashMap<String, String>
val ourMap = SuperSpecializedMap()

fun addToMap(key: String, value: String) {
    ourMap[key] = value
}

fun passTheMap(theMap: SuperSpecializedMap): String {
    // do something here
    val key = theMap["key"]
    return key ?: "Why don't you have my key?!"
}

fun explicitlyCreatedHashMap() {
    val hashMap = HashMap<String, String>()
    passTheMap(hashMap)
}
