package l6Kot

import kotlin.random.Random

class MyRandom {
    companion object {
        private const val MONDAY = "Monday"
        private const val TUESDAY = "Tuesday"
        const val WEDNESDAY = "Wednesday"
        const val THURSDAY = "Thursday"
        const val FRIDAY = "Friday"
        const val SATURDAY = "Saturday"
        const val SUNDAY = "Sunday"

        fun randomNumber(num: Int, num1: Int) = (Math.random() * (num1 - num + 1)).toInt() + num
        fun randomBoolean() = randomNumber(0,1) > 0
        fun randomWeekDay(): String {
            val index = randomNumber(1, 7)
            return when (index) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }
    }
}