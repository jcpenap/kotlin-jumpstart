package course.reflection

import kotlin.reflect.KFunction1
import kotlin.reflect.KFunction2

fun main(args: Array<String>)
{
    // can refer to instance methods of individual objects
    val r = "\\d+".toRegex()
    println(r.matches("123"))

    // this one takes a Regex
    var general: KFunction2<Regex, @ParameterName(name = "input") CharSequence, Boolean>
            = Regex::matches

    // this one doesn't need to
    var isNumber: KFunction1<@ParameterName(name = "input") CharSequence, Boolean>
            = r::matches // bound to the receiver
    println(isNumber("321"))
    print(general(r, "321"))

    val strings = listOf("foo", "333", "1")
    println(strings.filter(isNumber))

    // can also bind property references
    val lengthOfABC = "ABC"::length
    println(lengthOfABC.get())
}