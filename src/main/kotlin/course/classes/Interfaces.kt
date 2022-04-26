package course.classes

interface ISomething {

    fun doThings()

    val name: String get() = "something"
    val age: Int

    var foo: String
}

class Concrete(override var foo: String): ISomething {

    override val age: Int = 12

    override fun doThings() {
        println("doing something")
    }
}

fun main(args: Array<String>) {
    var c: ISomething = Concrete("Pizza")
    c.doThings()
    println(c.name)
    println(c.foo)
}