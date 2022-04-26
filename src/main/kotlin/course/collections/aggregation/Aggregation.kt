package course.collections.aggregation

import kotlin.math.sqrt

fun main(args: Array<String>) {

    val numbers = generateSequence(1) { it + 1 }
        .take(10).toList()

    println(numbers)

    println(numbers.joinToString("->"))

    println("sum (reduce) = ${numbers.reduce { x, y -> x + y }}")
    println("\nproduct (reduce) = ${numbers.reduceRight { x, y -> 
        print("($x * $y)")
        x * y }
    }")

    println("sum = ${numbers.sum()}, average = ${numbers.average()}")
    println("sum of squares = ${numbers.sumOf { it * it }}")
    println("sum of roots = ${numbers.sumOf { sqrt(it.toDouble()) }}")

    //reduce x[0] + x[1]
    //reduceRight x[last] + x[last -1]
    //fold: seed + x[0]
    println("sum (fold) = ${numbers.fold(0) { x, y -> x + y }}")
    println("product (fold) = ${numbers.fold(1) { x, y -> x * y }}")


    var three = numbers.take(3)

    //poly with x=3, coeff = 1, 2, 3
    //ax^2+bx+c = 1*3^2 + 2+3 + 3 = 18
    println("poly = ${numbers.foldIndexed(0, ){i, p, c -> 
        var xp = Math.pow(3.0, (2-i).toDouble()).toInt()
        c*xp + p
    }}")

    // 1,2,3 -> it^2
    //((1^2 + 2)^2 + 3)^2 = 144
    println("${three.fold(0) { p, x -> (p + x) * (p + x) }}")
    println("${three.foldRight(0) { p, x -> (p + x) * (p + x) }}")

}