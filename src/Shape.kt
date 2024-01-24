abstract class Shape (private var name : String) : Dimensionable{

    open fun getArea(): Double {
        return 0.0
    }

    open fun setDimensions(side: Double){

    }

    open fun setDimensions(len:Double, ht:Double){

    }

    open fun setDimensions(sideA:Double, sideB:Double, sideC:Double){

    }
}