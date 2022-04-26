fun main(args: Array<String>) {
    println(varsType1())
    println(varsType2())
}

fun varsType1() {
    val a:Int = 5
    val b:Long = 7L
    val c:Short = 2
    val d:Float = 7F
    val e:Double = 9.0
    println("$a $b $c $d $e")
    
    var f:Int = 10
    f = 20
    println("$f")

}


fun varsType2() {
    val a = 5
    val b = 7L
    val c = 2
    val d = 7F
    val e = 9.0
    println("$a $b $c $d $e")
    
    var f = 10
    f = 20
    println("$f")

}