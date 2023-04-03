import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    println("Enter The First number")
    val first = scan.nextInt()
    println("Enter the Second Number")
    val second = scan.nextInt()

    var gcd = 1
    var i = 1

    while (i <= first && i <= second) {
        if (first % i == 0 && second % i == 0)
            gcd = i
        i++
    }
    println("GCD or HCF of $first and $second is : $gcd")
}