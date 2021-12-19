fun main() {

    println(Counter2.count)

    Counter2.countUp()
    Counter2.countUp()

    println(Counter2.count)

    Counter2.clear()

    println(Counter2.count)
}

object Counter2 {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}