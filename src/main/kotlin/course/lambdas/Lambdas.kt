package course.lambdas

fun main(args: Array<String>) {
    val result: (Int, Int) -> Int = { x, y -> x * y }
    println("2*3 = ${result(2, 3)}")


    val numbers = listOf(7, 5, 2, 3)
    val n = numbers.count { it < 4 }
    println(n)

    var sum = 0
    numbers.forEach { sum += it }
    println(sum)

    fun <T> maxNumber(collection : Collection<T>, less: (T, T) -> Boolean) : T? {
        var max : T? = null
        for(x in collection) {
            if(max == null || less(max, x)) {
                max = x
            }
        }
        return max
    }

    var maxValue = maxNumber(numbers) { x, y -> x < y }
    println(maxValue)


    val increaseBy = fun Int.(value: Int) = this + value
    val x = 1
    println("$x + 3 = ${x.increaseBy(3)}")

    val a = Average()
    val avg = a(1.0, 2.0, 3.0)
    println(avg)

    operator fun String.invoke(): String {
        return "($this)"
    }

    var two = "two"
    println("I have 2 ${two()}")

}

class Average {
    public operator fun invoke(vararg values: Double) : Double {
        var sum = 0.0
        for(x in values) {
            sum += x
        }
        return sum / values.size
    }
}