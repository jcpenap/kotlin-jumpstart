package course.reflection

import java.lang.reflect.Method
import kotlin.reflect.KMutableProperty0
import kotlin.reflect.KProperty0
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.javaGetter

var x = 1
val y = 22

class Person2(var age: Int)

val String.lastChar: Char
    get() = this[length-1]

fun main(args: Array<String>) {
    val a: KMutableProperty0<Int> = ::x
    val b: KProperty0<Int> = ::y

    val strings = "this is fun".split(' ')
    println(strings.map(String::length))

    var person = Person2(33)

    var age = Person2::age
    age.get(person)

    var ls = String::lastChar
    println(ls.get("Hello"))

    var javaGetter: Method? = Person2::age.javaGetter
    var field = Person2::age.javaField
}