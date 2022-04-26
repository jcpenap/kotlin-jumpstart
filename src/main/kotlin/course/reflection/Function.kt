package course.reflection

fun isOdd(number: Int) = number%2 != 0
fun isOdd(s: String) =
    s == "weird" || s == "strange" || s == "peculiar"

fun main(args: Array<String>) {
    var numbers = generateSequence(1) { it+1 }.take(5)
    /*println(numbers.filter { isOdd(it) }.toList())*/
    println(numbers.filter(::isOdd).toList())

    val predicate : (String) -> Boolean = ::isOdd

    //f(g(x))
    fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
        return { x ->
            f(g(x))
        }
    }

    var strings = "This is a fun experiment".split(' ')
    var oddLength = compose(::isOdd, String::length)
    println(strings.filter(oddLength))

}