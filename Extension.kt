class MyClass1() {
    fun sayHello() {
        println("Hi --> from MyClass1")
    }
}

class myClass2() {
    companion object {
        fun display() {
            println("Displaying from Myclass2 Comapnion Object")
        }
    }
}


fun myClass2.Companion.disp() {
    println("Displaying from MyClass2 extension Class")
}

fun MyClass1.greet() {
    println("Hi --> from Companion extension Class")
}

fun main() {
    val m1 = MyClass1()
    m1.sayHello()
    m1.greet()
    myClass2.display()
    myClass2.Companion.disp()


}