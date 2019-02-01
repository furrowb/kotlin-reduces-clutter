package com.kotlin.`is`.awesome

// 'var' is equivalent to 'Class myClass'. In the constructor, this means generate a getter/setter
// 'val' is equivalent to 'final Class myClass'.  In the constructor, this means generate a getter only
// The 'class KotlinGetAndSet()` is creating a default constructor.
class KotlinGetAndSet(var myList: List<String>, val myMap: Map<Int, String>)