package thirtydaysofcode.day3

import kotlin.io.*
import kotlin.text.*

fun main() {
    val N = readLine()!!.trim().toInt()
    if (N % 2 == 1 || (N in 6..20)) {
        println("Weird")
    } else {
        println("Not Weird")
    }
}