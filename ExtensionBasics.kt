import java.util.*

class Calculation() {
    var numerator: Int = 0
    var denominator: Int = 0
}

fun Calculation.acceptInput() {
    val scan = Scanner(System.`in`)
    print("Enter The Numerator : ")
    numerator = scan.nextInt()
    print("Enter The Denominator : ")
    denominator = scan.nextInt()
}

fun Calculation.divide(): Int {
    return numerator / denominator
}

fun main() {
    val calci = Calculation()
    calci.acceptInput()

    try {
        val result = calci.divide()
        println("The Answer is  $result")

    } catch (e: ArithmeticException) {
        println(e.message)
    } finally {
        println("The Program Executed Successfully")
    }
}