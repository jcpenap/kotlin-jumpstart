fun main(args: Array<String>) {
    println(ifType1())
    println(ifType2())
    println(ifType3())
    println(ifType4())
}

fun ifType1() {
    
    val tem : Int = 20
    val feel : String;
    
    if(tem < 10) {
        feel = "cold"
    } else if(tem > 20) {
        feel = "warn"
    } else 
    	feel = "Ok"
    
    println("It is ${feel} today")
    
}


fun ifType2() {
    
    val tem = 20
    val feel = if(tem < 10) {
        "cold"
    } else if(tem > 20) {
        "warn"
    } else 
    	"Ok"
    
    println("It is ${feel} today")
    
}

fun ifType3() {
    
    val tem = 20
    val feel = if(tem < 10)
        "cold"
    else if(tem > 20)
        "warn"
    else 
    	"Ok"
    
    println("It is ${feel} today")
    
}

fun ifType4() {
    val tem = 20
    println("It is ${if(tem < 10) "cold" else if(tem > 20) "warn" else "Ok"} today")
}