package course.oddandends

fun main (args: Array<String>) {
    val v = arrayOf(1, 2, 3)
    try {
        println(v[10])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("We failed with ${e.toString()}")
    } finally {
        println("Whatever")
    }

    val text = "1f23"

    val number: Int? = try {
        text.toInt()
    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}