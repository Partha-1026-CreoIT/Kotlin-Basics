fun main() {
    var alphabet = 'A'
    for (i in 1..5)
    {
        for(j in 1..i)
        {
            print("${alphabet++} ")
        }
        println()
    }
}