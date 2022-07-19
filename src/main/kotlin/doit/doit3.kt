package doit

fun main() {
    val x = 2
    val s = "apple"
    data class Apple(val name: String)
    data class Banana(val name: String)
    Banana("b")
    val c = Apple("a")
    var y: Any?
    y = Banana("")
    val result = when (y) {
        is Apple -> "it is a fruit"
        is String -> "문자열입니다."
        is Integer -> "정수입니다."
//    is Banana -> "정수입니다."
//    in 1..10 -> println("x는 1 이상 10 이하입니다.")
//    !in 10..20 -> println("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
//    Integer.parseInt("1") -> println("일치함")
//    0, 1 -> println("x == 0 or x == 1")
//    else -> false
        else -> false
    }

//val result = when (s) {
//    is String -> "문자열입니다."
//    else -> false
//}
    println("result : ${result}")


}