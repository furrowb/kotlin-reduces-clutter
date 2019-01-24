import com.java.`is`.okay.GetAndSet
import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {
    val javaGetAndSet = com.java.`is`.okay.GetAndSet(mutableListOf("This", "Is", "Java"), mapOf(1 to "Java"))
    val kotlinGetAndSet = com.kotlin.`is`.awesome.GetAndSet(mutableListOf("This", "Is", "Kotlin"), mapOf(10 to "Kotlin"))

    println("This is Java: ${javaGetAndSet.myList}")
    println("This is Kotlin: ${kotlinGetAndSet.myList}")
}
