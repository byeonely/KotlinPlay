import java.util.*

fun main() {

    val numbers = arrayOf<Int>(4, 5, 7, 3)
    val numbers2 = intArrayOf(4, 5, 7, 3)
    val animals = arrayOf("Cat", "Dog", "Lion")
    val numberAnimals = arrayOf(4, 5, 7, 3, "Cat", "Dog", "Lion", false)
    val arr2d = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(7, 8, 9))

    val arr3 = Array(5) { i -> i * 2 }
    val arr4 = arrayOfNulls<Int>(1000)
    val arr5 = Array(1000) { 0 }

    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = arr1.plus(6)
    val arr6 = arr1.sliceArray(0..2)
    val arr7 = intArrayOf(8, 4, 3, 2, 5, 9, 1)

    val anyArr = Array<Any>(10) { 0 }
    anyArr[0] = "Hello World"
    anyArr[1] = 1.1

    arr1.forEach { element -> print("$element ") }
    println()
    arr1.forEachIndexed({ i, e -> println("arr[$i] = $e") })








//    println(anyArr[0])
//    println(anyArr[1])
//    println(anyArr[2])

//    println("ASC: ${arr7.sortedArray().contentToString()}")
//    println("DESC: ${arr7.sortedArrayDescending().contentToString()}")




//    println("arr2: ${arr2.contentToString()}")
//    println("arr6: ${arr6.contentToString()}")
//    println("arr1 first: ${arr1.first()}")
//    println("arr1 last: ${arr1.last()}")
//    println("indexOf(3): ${arr1.indexOf(3)}")
//    println("average: ${arr1.average()}")
//    println("count: ${arr1.count()}")
//    println("isContain: ${arr1.contains(5)}")
//    println("isContain2: ${5 in arr1}")

//    print(arr4.contentToString())
//    println()
//    println(arr5.contentToString())
//    println()
//    println(arr3.contentToString())

//    numbers[2] = 1
//    println("size: ${numbers.size} arr[0]: ${numbers[0]}, arr[2]: ${numbers[2]}")

//    for (i in numbers.indices) {
//        println("numbers[$i] = ${numbers[i]}")
//    }
//    println()
//    for (i in numberAnimals.indices) {
//        println("array[$i] = ${numberAnimals[i]}")
//    }

//    println(numbers2.contentToString())
//    println(animals.contentToString())
//    println(numberAnimals.size)
//    println(numbers.sum())


//    for (element in numbers2) {
//        println(element)
//    }

//    println(arr2d[1][1])
//    println(arr2d.get(index = 1).get(index = 1))

}