package course.collections.projection

fun main(args: Array<String>) {

    //(map, associate, flatMap)

    val seq: Sequence<Int> = generateSequence(1) { it + 1 }
    val numbers: Sequence<Int> = seq.take(4)
    val squares: Sequence<Int> = numbers.map { it * it }
    println(squares.toList())

    println()

    val sentence = "This is a nice sentence"
    val wordLengths = sentence.split(' ').map { it.length }.asSequence()
    println(wordLengths.toList())

    println()

    val wordsWithLength = sentence.split(' ').map {
        object {
            val length = it.length
            val name = it
        }
    }
    for (word in wordsWithLength) {
        println("'${word.name}' has length ${word.length}")
    }

    println()

    val wordLengthPairs = sentence.split(' ')
        .associateWith { it.length }
    for(word in wordLengthPairs) {
        println(word)
    }

    println()

    val sequences = listOf<String>("red,green,blue", "orange", "white,pink")
    val allWords = sequences.flatMap { it.split(',') }
    println(allWords)

    println()

    val objects = arrayOf("house", "car", "bicycle")
    val colors = arrayOf("red", "green", "blue")
    val pairs = objects.flatMap { o -> colors.map { c -> "$c $o" } }
    println(pairs)

}