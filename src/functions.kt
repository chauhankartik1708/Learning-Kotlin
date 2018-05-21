fun main(args: Array<String>) {
    println("Area of rectangle 3 X 4 is : " + area(3,4))
    println("Area of square of side 4 is  : " + area(4))
    sayHello()
}

fun area(base:Int,height:Int = base):Int {
    return (base * height)
}

fun sayHello(): Unit {
}