package thirtydaysofcode.day1

fun main() {
    val secondInt = readLine()!!.trim().toInt()
    val secondDouble = readLine()!!.trim().toDouble()
    val secondString = readLine()

    println(4 + secondInt)
    println(4.0 + secondDouble)
    println("HackerRank $secondString")
}