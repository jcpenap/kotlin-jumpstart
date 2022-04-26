package course.classes

interface IFactory<T> {
    fun create() : T
}

class NewPoint(var x: Double, var y: Double) {

    companion object /*Factory*/ : IFactory<NewPoint> {

        override fun create(): NewPoint {
            return NewPoint(0.0, 0.0)
        }

        fun createCarterian(x: Double, y: Double): NewPoint = NewPoint(x, y)

        fun createPolar(x: Double, y: Double): NewPoint = NewPoint(x, y)

    }
}

fun main(args : Array<String>) {
    var simplePoint = NewPoint(1.0, 2.0)
    //  First companion type
    /*var factoryPoint = NewPoint.Factory.createCarterian(3.0, Math.PI/2)*/
    //  Second companion type
    var factoryPoint2 = NewPoint.createCarterian(3.0, Math.PI/2)
    //  Third companion type
    var defaultPoint = NewPoint.Companion.create()
}