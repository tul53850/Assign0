import kotlin.math.sqrt

open class Triangle(name: String) : Shape(name) {

    private var a = 0.0
    private var b = 0.0
    private var c = 0.0
    override fun printDimensions() {
        println(a)
        println(b)
        println(c)
    }

    override fun setDimensions(sideA:Double, sideB:Double, sideC:Double){
        a=sideA
        b=sideB
        c=sideC
    }

    override fun getArea(): Double {
        return sqrt((a+b+c)*(b+c)*(a+c)*(a+b))
    }
}