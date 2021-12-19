fun main() {

    // 함수를 일종의 변수로 사용할 수 있다는 편의성이 있음
    // 컬렉션의 조작이나 스코프 함수의 사용에도 도움이 됨

    // 고차함수
    b(::a)

    // 람다함수
    val c: (String)->Unit = { str -> println("$str 람다함수") }
    val d = { str: String -> println("$str 축약형 람다함수")}
    c("c 이것은")
    b(c)
    b(d)

    // 람다함수의 특별한 케이스들
    // 1. 람다함수도 일반함수처럼 한줄만이 아닌 여러줄의 구문을 수행할 수 있다
    // 2. 패러미터가 없는 람다함수는 실행할 구문들만 나열하면 됨
    // 3. 패러미터가 1개일 뿐이라면 it을 사용

    val e = { str: String ->
        println("------")
        println("$str 여러줄의 람다함수")
        println("여러 구문을")
        println("사용 가능합니다")
    }

    val calculate: (Int, Int) -> Int = { a, b ->
        println(a)
        println(b)
        a+b
    }

    val f: () -> Unit = { println("패러미터가 없어요") }
    val g: (String) -> Unit = { println("$it 람다함수") }

    b(e)
    println(calculate(1, 1))
    f()
    g("패러미터 1개는 it")

}

fun a (str: String) {
    println("$str 함수 a")
}

fun b (function: (String)->Unit) {
    function("b가 호출한")
}