package com.kotlin.`is`.awesome

class KotlinLambda<T>(private val list: List<T>) {

    // Can immediately see the requirements of our lambda
    // Takes a List of T, returns a List of T
    fun filter(lambda: (List<T>) -> List<T>) = lambda.invoke(this.list)
}