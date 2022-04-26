package course.classes

data class Human(var name: String, val age: Int) {

}

fun main(args: Array<String>) {
    var human = Human("Juan", 36)
    println(human)

    var human2 = Human("Juan", 36)
    println(human == human2)

    var human3 = human.copy()
    println(human === human3)

    val (name, age) = human
    println("$name, $age")
}