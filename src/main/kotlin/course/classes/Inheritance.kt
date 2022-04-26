package course.classes

open class NewPerson(var name: String) {
    open fun talk(){
        println("Hi, I am $name")
    }
}

class Manager(name: String, var subordinates: List<NewPerson>) : NewPerson(name) {
    override fun talk() {
        println("I am $name and I have ${subordinates.size} subordinates")
    }
}

fun main(args: Array<String>) {

    var john = NewPerson("John")
    john.talk()

    var boss = Manager("Alfred", listOf(john))
    boss.talk()
}