import kotlin.intArrayOf

fun main(args:Array<String>) {
    
    val a : Array<String> = arrayOf("Juan", "Nancy", "Linda", "Luis", "Alejo", "Gabriel", "Yiseth")
    println(a.asList())
    
    val b = arrayOf("Juan", "Nancy", "Linda", "Luis", "Alejo", "Gabriel", "Yiseth")
    println(b.asList())        
    
    val c : IntArray =  intArrayOf(5, 7, 8, 10)
    println(c.asList())
    
    val d =  intArrayOf(5, 7, 8, 10)
    println(d.asList())
    
    val e : Array<Int> = Array<Int>(5, {n -> n*2})
    println(e.asList())
    
    val f = Array<Int>(5, {n -> n*2})
    println(f.asList())
    
    val g : IntArray = IntArray(5, {n -> n*2})
    println(g.asList())
    
    val h = IntArray(5, {n -> n*2})
    println(h.asList())
    
}