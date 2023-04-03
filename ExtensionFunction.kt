class Radio(private val frequency: Double) {
    fun play() {
        println("The Radio is playing Fm from $frequency")
    }
}

class Car(private val radio: Radio, private val name: String) {
    private fun printName() {
        print(name)
    }

    private fun Radio.details() {
        printName()
        print(":")
        radio.play()
    }

    fun showDetails() {
        radio.details()
    }
}

fun main() {
    val car = Car(Radio(98.3), "Baleen")
    car.showDetails()
}