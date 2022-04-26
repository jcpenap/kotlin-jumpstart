package course.classes

object PointFactory {
    fun newCarterianPoint(x: Double, y: Double) : Point {
        return Point(x, y)
    }
    fun newPolarPoint(rho: Double, theta: Double) : Point {
        return Point(rho*Math.cos(theta), rho*Math.sin(theta))
    }
}

class Point(var x: Double, var y: Double)

fun main(args: Array<String>) {
    /*var pt = PointFactory()
    var point = pt.newPolarPoint(3.0, Math.PI/2)*/
    var point = PointFactory.newPolarPoint(3.0, Math.PI/2)
}