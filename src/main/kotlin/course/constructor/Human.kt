package course.constructor

class Human(var name: String, val age: Int) {
    init {
        println("Human inited with $name and $age")
    }
}

fun main(args: Array<String>) {
    var human = Human("Juan", 36)
    println("My name is ${human.name} and I'm ${human.age} years old.")
    human.name = "Luismi"
    //does not compile
    //human.age = 123
}