package doit

fun main() {
    var total = 0
    for (num in 1..100 step 2) total += num
    println("Odd total: $total")
    total = 0
    for (num in 0..98 step 2) total += num
    println("Even total: $total")
}