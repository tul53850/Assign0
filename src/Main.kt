fun main() {
    val cir: Shape = Circle("circl1")
    val sqa: Shape = Square("square1")
    val tri: Shape = Triangle("triangle1")
    val equ: Shape = EquilateralTriangle("equilateral")

    print("Enter Circle Radius: ")

    val rad1 = readln()
    //println("You entered: $rad1")
    cir.setDimensions(rad1.toDouble())
    cir.printDimensions()


    print("Enter Square Radius: ")

    val s1 = readln()
    //println("You entered: $rad1")
    sqa.setDimensions(s1.toDouble(), s1.toDouble())
    sqa.printDimensions()

    print("Enter Square Radius: ")

    val eqt = readln()
    //println("You entered: $rad1")
    equ.setDimensions(eqt.toDouble())
    equ.printDimensions()

    equ.printDimensions()




}