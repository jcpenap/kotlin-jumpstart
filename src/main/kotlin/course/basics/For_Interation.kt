fun main(args:Array<String>) {
    
    for(a in (10 downTo 1)) {
        println("$a\n")
    }
    
    val ints : IntArray = intArrayOf(7, 5, 9)
    for(value in ints) {
        println(value)
    }
    
    val b = intArrayOf(7, 5, 9)
    for((index, value) in b.withIndex()) {
        println("Index $index = Value $value")
    }
    
    val capitals = mapOf("Rome" to "Italy", "Madrid" to "Spain")
    for((capital, country) in capitals) {
        println("$capital is the capital of $country")
    }
    
}