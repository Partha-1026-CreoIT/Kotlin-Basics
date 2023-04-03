import java.util.Scanner

fun main() {


    val scan = Scanner(System.`in`)
    println("Enter the Number")
    val n = scan.nextInt()
    var n1 = 0
    var n2 = 1

    for (i in 1..n) {
        print("$n1 + ")
        var n = n1 + n2
        n1 = n2
        n2 = n
    }
}