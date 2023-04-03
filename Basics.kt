fun main() {
    val list = mutableListOf(10, 40, 90, 100)
    val list1 = mutableListOf(100, 200, 500, 700)
    println(list.swap(0, 2))
    println(list1.swap(1, 3))
}

fun MutableList<Int>?.swap(first: Int, second: Int): Any {
    if (this == null) return "null"
    else {
        val temp = this[first]
        this[first] = this[second]
        this[second] = temp
        return this
    }
}