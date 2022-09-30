package com.kotlin.`is`.awesome

// 'var' is equivalent to 'Class myClass'. In the constructor, this generates the getter/setter
// 'val' is equivalent to 'final Class myClass'.  In the constructor, this generates the getter only
// The 'class KotlinGetAndSet()` is creating a default constructor.
class KotlinGetAndSet(var myList: MutableList<String>, val myMap: Map<Int, String>)