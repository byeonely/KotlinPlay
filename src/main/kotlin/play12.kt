// equals() 의 내용을 자동구현
// 객체의 내용에서 고유한 hashcode 를 반환
// 포함된 속성을 보기쉽게 보여주는 toString() 의 자동구현
// 객체를 복사하여 새로운 객체를 만들 수 있는 copy() 의 자동구현
// 속성을 반환 componentX() 계열의 함수 자동구현

fun main() {

    val aa = General("보영", 212)

    println(aa == General("보영", 212))
    println(aa.hashCode())
    println(aa)

    println()

    val bb = Data("루다", 306)

    println(bb == Data("루다", 306))
    println(bb.hashCode())
    println(bb)

    println(bb.copy())
    println(bb.copy(name = "아린"))
    println(bb.copy(id = 618))

    val list = listOf(Data("보영", 212),
                      Data("루다", 306),
                      Data("아린", 618))

    for ((a, b) in list) {
        println("${a}, ${b}")
    }

    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())

    state = State.EAT
    println(state.message)

}

enum class State(val message: String) {
    SING("노래를 부릅니다"),
    EAT("밥을 먹습니다"),
    SLEEP("잠을 잡니다");

    fun isSleeping() = this == State.SLEEP
}

class General(val name: String, val id: Int)

data class Data(val name: String, val id: Int)