package course.collections.operations

data class Person(var name: String, var age: Int)

fun main(args: Array<String>) {

    //distinct, intersect, union, subtract, distinctBy
    val word1 = "hellooooo".toCharArray().toList()
    val word2 = "help!".toCharArray().toList()

    println(word1.distinct())
    println(word1.intersect(word2.toSet()))
    println(word1.union(word2.toSet()))
    println(word1.subtract(word2.toSet()))

    val people = arrayOf(
        Person("John", 20),
        Person("Jill", 20),
        Person("John", 35)
    )

    println("Distinct by name: ${people.distinctBy { it.name }}")
    println("Distinct by age: ${people.distinctBy { it.age }}")
}