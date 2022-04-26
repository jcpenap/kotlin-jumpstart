package course.classes

import java.util.*

class Person3 {
    lateinit var name: String
    val age: Int = 0
}

fun main(args: Array<String>) {
    val a = Person3()
    a.name = "Juan"
    println("Name: ${a.name}, Age: ${a.age} ")
}
