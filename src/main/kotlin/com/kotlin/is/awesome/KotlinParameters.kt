package com.kotlin.`is`.awesome

class KotlinParameters {
    // 'lateinit var' tells the compiler we will eventually set these and if we don't, throw an exception
    lateinit var firstSetting: String
    lateinit var secondSetting: String
    lateinit var thirdSetting: String

    // Has a default 'thirdSetting' parameter that we don't have to pass in
    fun setParams(firstSetting: String, secondSetting: String, thirdSetting: String = "Default") {
        this.firstSetting = firstSetting
        this.secondSetting = secondSetting
        this.thirdSetting = thirdSetting
    }
}