//import java.util.Scanner
//
//data class Item(val id: Int, val order: Int, val name: String)
//
//class SpotMap(items: List<Item>) {
//    val spotMap = mutableMapOf<Int, Item>()
//
//    init {
//        for (i in items) {
//            spotMap[i.id] = i
//        }
//    }
//
//    fun getItem(spotNumber: Int): Item? {
//        return spotMap[spotNumber]
//    }
//}
//
//fun main() {
//    val items = listOf(
//        Item(29, 30, "Amsterdam"),
//        Item(15, 14, "Bhopal"),
//        Item(30, 28, "Brussels"),
//        Item(13, 12, "Chennai"),
//        Item(57, 56, "Coorg"),
//        )
//    val spotMap = SpotMap(items)
//    val scan  = Scanner(System.`in`)
//    println("Enter The SpotNumber")
//    val spotNumber = scan.nextInt()
//    val item = items.firstOrNull { it.id == spotNumber }
//    //val item = spotMap.getItem(spotNumber)
//    if (item != null) {
//        println("Items with spot number $spotNumber : ${item.name}")
//    }
//    else{
//        println("No item found with spot Number $spotNumber")
//    }
//
//
//}