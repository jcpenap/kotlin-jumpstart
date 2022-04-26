package course.reflection

class Person3

fun <T> makeAndPrint(generator: () -> T) {
    val x : T = generator()
    println(x.toString())
}

fun main(args: Array<String>) {
    makeAndPrint(::Person3)
}