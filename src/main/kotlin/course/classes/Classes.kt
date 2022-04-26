package course.classes

class Person {
    //lateinit var name
    lateinit var name: String
    // default age init
    var age: Int = 1
    //readonly canVote base on age condition
    val canVote: Boolean
        get() = age >= 18
    //customise snn get and set
    var ssn = "00000000"
        get() = field
        set(value) {
            println("$name ssn changed")
            field = value
        }

}

fun main(args: Array<String>) {
    val a = Person()
    a.name = "Juan"
    a.age = 12
    println("${a.name} can${if (!a.canVote) "not" else ""} vote")
    a.ssn = "123456"
}