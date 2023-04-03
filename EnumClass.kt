import java.util.Scanner

interface Price {
    fun priceOfPizza(): Int
}

enum class Pizza(val size: Int) : Price {

    Small(10) {
        override fun priceOfPizza(): Int {
            return 200
        }
    },
    Medium(12) {
        override fun priceOfPizza(): Int {
            return 350
        }
    },
    Large(14) {
        override fun priceOfPizza(): Int {
            return 550
        }
    },

}

fun main() {
    val scan = Scanner(System.`in`)
    for (i in Pizza.values()) {
        println("The Available Size is $i")
    }
    println("Enter Your Pizza Size")
    val pc = scan.nextLine().toString().capitalize()
    val p = Pizza.valueOf(pc)
    println("The Price of the pizza is ${p.priceOfPizza()}")
    println("The Size of the pizza is ${p.size}")

}