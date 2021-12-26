fun main() {

    val fruitSet = mutableSetOf("귤", "바나나", "키위")

    for (fruit in fruitSet) {
        println(fruit)
    }

    fruitSet.add("자몽")
    println(fruitSet)

    fruitSet.remove("바나나")
    println(fruitSet)

    println(fruitSet.contains("귤"))

    println()

    val idolMap = mutableMapOf("레드벨벳" to "음파음파",
                               "트와이스" to "FANCY",
                               "ITZY" to "ICY")

    for (entry in idolMap) {
        println("${entry.key} : ${entry.value}")
    }

    idolMap.put("오마이걸", "번지")
    println(idolMap)

    idolMap.remove("ITZY")
    println(idolMap)

    println(idolMap["레드벨벳"])

}

