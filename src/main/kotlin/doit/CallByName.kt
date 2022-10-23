package doit

// 이름에 의한 람다식 호출
fun main() {
    // 람다식의 이름이 인자로 전달될 때 실행되지 않고 실제로 호출될 때 실행되도록 함
    // 함수식 자체를 인자로 넘김
    // 해당 함수식의 실행은 함수 내에서 결정함
    // 람다식 이름 뒤에 () 괄호를 붙여서 실행함
    val result = callByName(otherLambda) // 람다식 이름으로 호출
    println(result)
}

fun callByName(b: () -> Boolean): Boolean { // 람다식 자료형으로 선언된 매개변수
    println("callByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}

