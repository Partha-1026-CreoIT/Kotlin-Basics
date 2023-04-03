import java.util.Scanner

fun main() {

    try {
        val scan = Scanner(System.`in`)
        println("Enter The First Number")
        val num1 = scan.nextInt()
        println("Enter The Second Number")
        val num2 = scan.nextInt()
        val num3 = num1 / num2
        println("The Answer is $num3")
    }catch (e:ArithmeticException){
        println(e.message)
    }
}