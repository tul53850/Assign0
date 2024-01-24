class Circle(name: String) : Shape(name) {
    private var radius = 0.0

    override fun printDimensions() {
        println(radius)
    }

    fun setDimensions(rad: Double){
        radius = rad
    }

    override fun getArea(): Double {
        return radius*radius
    }
}