import kotlin.math.sqrt

class EquilateralTriangle(name: String) : Triangle(name) {

    private var s = 0.0

    override fun printDimensions() {
        //super.printDimensions()
        println(s)
    }

    override fun setDimensions(side: Double){
        s = side
    }

    override fun getArea(): Double {
        return sqrt((s+s+s)*(s+s)*(s+s)*(s+s))
    }
}