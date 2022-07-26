package doit

fun main() {
    var sum = 0
    for (x in 1..10) sum += x
    println("sum : $sum")

    for (i in 5 downTo 1) print(i)
    println()
    for (i in 1..5 step 2) print(i)
    println()
    for (i in 5 downTo 1 step 2) print(i)
    println()
    for (i in 1..1) println(i)
}