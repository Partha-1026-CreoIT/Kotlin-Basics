class Circle(val radius: Int) {
    fun area(): Double {
        return Math.PI * radius * radius
    }
}

fun Circle.perimeter(): Double {
    return 2 * Math.PI * radius
}

fun main() {
    val c = Circle(5)
    println(c.area())
    println(c.perimeter())
}
