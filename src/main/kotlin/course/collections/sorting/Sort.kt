package course.collections.sorting

import course.collections.grouping.Person
import java.util.*

data class Person(var name: String, var age: Int)

fun main(args: Array<String>) {

    //sorted, sortedDescending, sortedWith, thenByDescending
    val rand = Random()
    val randomValues = generateSequence{ rand.nextInt(10) - 5}
        .take(10).toList()

    println(randomValues)
    println(randomValues.sorted())
    println(randomValues.sortedDescending())

    val people = arrayOf(
        Person("Adam", 36),
        Person("Boris", 18),
        Person("Clair", 36),
        Person("Adam", 20),
        Person("Jack", 20)
    )

    println(people)
    println(people.sortedBy { it.name })

    println(people.sortedWith(compareBy(Person::age, Person::name)))
    println(people.sortedWith(compareBy({ it.name }, { it.age })))
    println(people.sortedWith(compareBy<Person> { it.age }.thenByDescending { it.name }))
}