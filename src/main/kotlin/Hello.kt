import course.funtions.*

fun main (args : Array<String>) {
    sayHello()
    calculate(4)

    val a = anotherOperation()
    println(a)

    val b = anotherOperation(firstValue = 7, secondValue = 5)
    println(b)

    val c = newOperation(firstValue = 8, secondValue =3)
    println(c)

    val d = sumUp(6, 4, 6, 8)
    println(d)

    val stuff = intArrayOf(4, 7)
    val e = newVersionOfSumUp(6, 4, *stuff, 6, 8)
    println(e)

    val(x1, x2) = secondVersionOfQuadraticEquation(1.0, 10.0, 16.0)
    println("X1: $x1 X2: $x2")

    val f = 10.0 averagedWith 5.0
    println("The average between a and b is $f")

    val list = arrayListOf(1, 2, 3)
    list.swap(0, 2)
    println(list)

    list.print()

    val s: String? = null
    println(s.empty)
}

