fun main() {

    val foodCourt = FoodCourt()

    foodCourt.searchPrice(FoodCourt.FOOD_CREAM_PASTA)
    foodCourt.searchPrice(FoodCourt.FOOD_STEAK)
    foodCourt.searchPrice(FoodCourt.FOOD_PIZZA)

    val lateInitSample = LateInitSample()

    println(lateInitSample.getLateInitText())
    lateInitSample.text = "새로 할당한 값"
    println(lateInitSample.getLateInitText())
    println()

    val number: Int by lazy {
        println("초기화를 합니다")
        7
    }

    println("코드를 시작합니다")
    println(number)
    println(number)
}

class LateInitSample {
    lateinit var text: String

    fun getLateInitText(): String {
        if(::text.isInitialized) {
            return text
        } else {
            return "기본"
        }
    }
}

class FoodCourt {
    fun searchPrice(foodName: String) {
        val price = when (foodName) {
            FOOD_CREAM_PASTA -> 13000
            FOOD_STEAK -> 25000
            FOOD_PIZZA -> 15000
            else -> 0
        }

        println("${foodName}의 가격은 ${price}원 입니다")
    }

    companion object {
        const val FOOD_CREAM_PASTA = "크림파스타"
        const val FOOD_STEAK = "스테이크"
        const val FOOD_PIZZA = "피자"
   }
}