package com.kotlin.`is`.awesome

class KotlinString(item1: String, item2: String) {
    private var combinedString: String

    init {
        combinedString = "$item1 $item2"
    }

    fun combinedString() = combinedString

    fun blockText() = """
        Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
        sed diam nonumy eirmod tempor invidunt ut labore et dolore magna
        aliquyam erat, sed diam voluptua. At vero eos et accusam et justo
    """.trimIndent()
}