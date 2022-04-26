package course.oddandends

enum class Direction { North, South, East, West }

enum class Color(val rgb: Int) {
    Red(0xff0000) {
        override fun example(): String {
            return "blood"
        }
    },
    Green(0x00ff00) {
        override fun example(): String {
            return "grass"
        }
    },
    Blue(0x0000ff) {
        override fun example(): String {
            return "sky"
        }
    };

    abstract fun example(): String
}

fun main(args: Array<String>) {
    val dir = Direction.East
    println(dir)

    var b = Color.Blue
    println("b has the name ${b.name}, value = ${b.rgb}, position = ${b.ordinal}")

    println("$b is the color of ${b.example()}")

    for (color in Color.values()) {
        println(color)
    }

    println("Value of red is ${Color.valueOf("red").rgb}")

}