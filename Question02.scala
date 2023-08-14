object Question02 extends App {

    val printMessage: Int => String = {
        case n if n <= 0 => "Negative/Zero is given"
        case n if n % 2 == 0 => "Even number is given"
        case n => "Odd number is given"
    }

    print("Enter an integer : ")
    val input = scala.io.StdIn.readInt()
    println(printMessage(input))

}
