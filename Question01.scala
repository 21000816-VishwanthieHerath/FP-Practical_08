import scala.io.StdIn

object Question01 extends App {

    val interest: Double => Double = deposit => {
        if (deposit <= 20000) 0.02 * deposit
        else if (deposit <= 200000) 0.04 * deposit
        else if (deposit <= 2000000) 0.035 * deposit
        else 0.065 * deposit
    }

    print("Enter the deposit amount: Rs. ")
    val depositAmount = StdIn.readDouble()
    val interestAmount = interest(depositAmount)
    println(f"The interest is Rs. $interestAmount%.2f")

}

