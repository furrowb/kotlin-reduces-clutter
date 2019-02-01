package com.kotlin.`is`.awesome

class KotlinParameters {
    lateinit var firstSetting: String
    lateinit var secondSetting: String
    lateinit var thirdSetting: String

    fun setParams(firstSetting: String, secondSetting: String, thirdSetting: String = "Default") {
        this.firstSetting = firstSetting
        this.secondSetting = secondSetting
        this.thirdSetting = thirdSetting
    }
}