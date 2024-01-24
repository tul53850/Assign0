class Circle(name: String) : Shape(name) {
    private var radius = 0.0

    override fun printDimensions() {
        println(radius)
    }

    override fun setDimensions(side: Double){
        radius = side
    }

    override fun getArea(): Double {
        return radius*radius
    }
}