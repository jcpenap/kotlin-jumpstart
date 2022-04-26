fun main(args:Array<String>) {
    
    val a : String = "Hello world"
    println(a.length)
    
    val b : String? = null
    println(b?.length)
    
    val c : String? = null
    println(c?.length ?: -1)
    
    val d : String? = "Hello world"
    println(d?.length ?: -1)
    
    val e = "Hello world"
    println(e?.length ?: -1)
    
	//show the NullPointerException
    val f : String? = null
    println(c!!.length)
	
	//Does not compiles
	/*val g : String = null
    println(g.length)*/
    
}