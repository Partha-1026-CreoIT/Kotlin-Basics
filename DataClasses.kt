//// Data Classes Have 4 function
//1) toString
//2) copy()
//3) hashCode()
//4) equals()

data class Person(var name: String, var age: Int)

fun main() {
    //toString
    val p = Person("Partha", 22)
    println(p)
    println("------------------------------")

    //copy()
    val p1 = Person("Suresh",45)
    println("data is $p1")

    val p2 = p1.copy()
    println("Copied data is $p2")

    val p3 = p1.copy(age = 50)
    println("data is $p3")

    println("------------------------------")

    //hashcode()
    println(p1.hashCode())
    println(p2.hashCode())
    println(p3.hashCode())

    println("------------------------------")

    //equals()
    if (p1.equals(p2)==true)
    {
        println("p1 and p2 are equal")
    }
    else if (p2.equals(p3)==true)
    {
        println("p2 and p3 are equal")
    }
}

