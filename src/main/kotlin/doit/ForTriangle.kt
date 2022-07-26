package doit

fun main() {
    print("Enter the lines: ")
    val n = readLine()!!.toInt() // 콘솔로부터 입력받음

    for (line in 1..n) {
        for (space in 1..(n - line)) print(" ") // 공백 출력
        for (star in 1..(2 * line - 1)) print("*") // 별표 출력
        println()
    }
}