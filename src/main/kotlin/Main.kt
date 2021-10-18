import java.io.File

fun main() {
    //Create a list of 3 elements of your favourite city's names then add more 2 elements
    // then update last element finally print the whole list with the numbers
    var favCities = mutableListOf("Riyadh", "Jeddah", "Mecca")
    favCities.add("Dammam")
    favCities.add("Taif")
    favCities[favCities.size - 1] = "Tabuk"

    favCities.forEachIndexed() { index, city -> println("$index - $city") }

    println("---------------------")
    //Create a list of integer with 5 elements then update the 3th element to 12
    // then check if the 12 if existing delete the element finally print the list
    var listOfInt = mutableListOf(1, 2, 3, 4, 5)
    listOfInt[2] = 12
    listOfInt.removeIf { element -> element == 12 }
    println(listOfInt)

    println("---------------------")
    //Create a text file and read it
    var readFromFile = File("data/inputs.txt").readText().split(",")
    //println(readFromFile)

    println("---------------------")
    //Create a list of 10 number then return the maximum number
    var max = listOfInt[0]
    var listOfNumber = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    listOfNumber.forEach { number -> if (max <= number) max = number }
    println(max)

}