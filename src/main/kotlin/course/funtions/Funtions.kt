package course.funtions

fun sayHello() {
    println("Hello world!")
}

//Return Unit (void) type method
fun sayHello2(): Unit {
    println("Hello world!")
}

//Return type method
fun calculate(number: Int): Int {
    return number * 3
}

//Return type method with default params
fun anotherOperation(firstValue: Int = 2, secondValue: Int = 5): Int {
    return firstValue + secondValue
}

//Return type method with default params in a single line
fun newOperation(firstValue: Int = 2, secondValue: Int = 5) = firstValue + secondValue

fun sumUp(vararg values: Int): Int {
    var result: Int = 0
    for (value in values) {
        result += value
    }
    return result
}

fun newVersionOfSumUp(vararg values: Int): Int {
    return values.sum()
}

//Nested or Inner Functions
fun solveQuadraticEquation(a: Double, b: Double, c: Double): Pair<Double, Double> {
    fun calculateDiscriminant(a: Double, b: Double, c: Double): Double {
        return b * b - 4 * a * c
    }

    val rootDisc = Math.sqrt(calculateDiscriminant(a, b, c))
    return Pair((-b + rootDisc) / (2 * a), (-b - rootDisc) / (2 * a))
}

//Nested or Inner Functions
fun secondVersionOfQuadraticEquation(a: Double, b: Double, c: Double): Pair<Double, Double> {
    fun calculateDiscriminant(): Double {
        return b * b - 4 * a * c
    }

    val rootDisc = Math.sqrt(calculateDiscriminant())
    return Pair((-b + rootDisc) / (2 * a), (-b - rootDisc) / (2 * a))
}

infix fun Double.averagedWith(a: Double): Double {
    return (this + a) / 2.0
}

//Extension Function
fun <T> ArrayList<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}

//Extension Function
fun Any?.print() {
    if (this == null) println("Object is null")
    else println("object is ${this}")
}

//Extension Function
val String?.empty: Boolean
    get() = (this == null || this.length === 0)

