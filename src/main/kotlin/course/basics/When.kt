fun getCode() = 90

fun main(args: Array<String>) {
    println(type1())
    println(type2())
    println(type3())
}

fun type1() {
    val code = 90
    when(code) {
        44 -> println("Maria")
        56 -> println("Paula")
        60, 65 -> println("Martha")
        in 70..80 -> println("Adriana")
		getCode() -> println("Melissa")
		else -> println("Invalid code")
    }
}

fun type2() {
    val code : Any = 50
    when(code) {
        is Int -> println("Maria")
        is String -> println("Paula")
        else -> println("Don't know how to handle")
    }    
}

fun type3() {
    val code = 90
    val name = when(code) {
        44 -> "Maria"
        56 -> "Paula"
        60, 65 -> "Martha"
        in 70..80 -> "Adriana"
		getCode() -> "Melissa"
		else -> "Invalid code"
    }
    println("$name")
}