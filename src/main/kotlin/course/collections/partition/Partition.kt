package course.collections.partition

fun main(args: Array<String>) {

    //Partition, Drop, takeWhile, dropWhile

    var seq = arrayOf(-2, -1, 0, 1, 2)
    val (neg, others) = seq.partition { it < 0 }
    println(neg)
    println(others)

    var numbers = arrayOf(3, 3, 2, 2, 1, 1, 2, 2, 3, 3)
    println(numbers.drop(2).take(6))

    println(arrayOf<Any>().take(2))

    println(numbers.takeWhile { it > 1 })

    println(numbers.dropWhile { it == 3 })

    println(numbers.dropLast(4))
}