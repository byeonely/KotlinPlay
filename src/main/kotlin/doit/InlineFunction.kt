package doit

fun main() {
    shortFunc(3) { println("First call: $it") }
    shortFunc(5) { println("Second call: $it") }

    shortFunc2("apple") { println("Third call $it") }
    shortFunc2("banana") { println("Forth call $it") }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")

}

inline fun shortFunc2(a: String, out: (String) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}