// 컬렉션 함수

fun main() {

    val nameList = listOf("박수영", "김지수", "김다현", "신유나", "김지우")

    nameList.forEach { print("$it ") }
    println()

    println(nameList.filter { it.startsWith("김") })

    println(nameList.map { "이름 : $it" })

    // any : 해당 조건을 만족하는 아이템이 하나라도 있으면 true 반환
    println(nameList.any { it == "김지연" })

    // all : 해당 조건을 아이템들이 모두 만족하면 true 반환
    println(nameList.all { it.length == 3 })
    println(nameList.none { it.startsWith("이") })

    // 해당 조건을 만족하는 첫번째/마지막 아이템을 반
    println(nameList.first { it.startsWith("김") })
    println(nameList.last { it.startsWith("김") })
    println(nameList.count { it.contains("지") })

}