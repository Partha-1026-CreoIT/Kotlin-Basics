import java.util.*

data class MainCity(
    val id: Int,
    val name: String,
    val place: List<Places>
)

data class Places(
    val id: Int,
    val name: String,
    val weather: String
)

class SpotMap(
    private val mainCities: List<MainCity>
) {
    fun getPlaceDetails(mainCityName: String): List<Any>? {
        val mainCity = mainCities.find { it.name == mainCityName }
        return mainCity?.place?.map { places ->
            "Places in the $mainCityName are ${places.name} , Weather : ${places.weather} , Id : ${places.id}"
        }
    }
}

fun main() {
    val placesOfCoorg = listOf(
        Places(1, "Mall Halli Falls", "Cool"),
        Places(2, "Raja's Seat", "Cool"),
    )
    val placesOfBangalore = listOf(
        Places(4, "LalBagh", "Hot"),
        Places(5, "Creo It", "Cool"),
    )
    val placesOfShimoga = listOf(
        Places(5, "JogFalls", "Cool"),
        Places(6, "Kuppalli", "Cool"),
    )

    val mainCity = listOf(
        MainCity(10, "Coorg", placesOfCoorg),
        MainCity(11, "Bangalore", placesOfBangalore),
        MainCity(12, "shimoga", placesOfShimoga),
    )
    val spotMap = SpotMap(mainCity)

    val scan = Scanner(System.`in`)
    println("Enter the City Name")
    val details = scan.nextLine()
    val placeDetails = spotMap.getPlaceDetails(details.lowercase())
//    val placeDetails = spotMap.getPlaceDetails("Coorg")
    if (placeDetails != null) {
        placeDetails.forEach { println(it) }

    } else {
        println("MainCity Not Found")
    }
}