class Square(name: String) : Shape(name) {
    private var length = 0.0
    private var height = 0.0
    init{

    }


    override fun printDimensions() {
        println(length)
        println(height)
    }

    override fun setDimensions(len:Double, ht:Double) {
        length = len
        height = ht
    }

    override fun getArea(): Double {
        return length*height
    }
}