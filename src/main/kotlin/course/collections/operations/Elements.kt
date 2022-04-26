package course.collections.operations

fun main(args: Array<String>) {
    val numbers = arrayOf(1, 2, 3)
    println("First element is ${numbers.first()}")
    println("First element greatest than 2 is ${numbers.first { it > 2 }}")
    println("First element greatest than 10 is ${numbers.firstOrNull { it > 10 }}")

    println(numbers.last())
    println(numbers.last { it < 3 })

    println("Three: ${numbers.single { it == 3 }}")

    println(numbers.singleOrNull())

    println("element at position 4: ${numbers.elementAtOrNull(4)}")
    println("item at position 100: ${numbers.elementAtOrElse(100){-it}}")
}