package course.collections.grouping

data class Person(var name: String, var age: Int)

fun main(args: Array<String>) {
    val people = arrayOf(
        Person("Adam", 36),
        Person("Boris", 18),
        Person("Clair", 36),
        Person("Adam", 20),
        Person("Jack", 20)
    )

    val byName: Map<String, List<Person>> = people.groupBy(Person::name)
    println(byName)

    val byAgeNames = people.groupBy({ it.age }, { it.name })
    for(item in byAgeNames) {
        println("These people are ${item.key} years old")
        for (name in item.value) {
            println("- $name")
        }
    }
}