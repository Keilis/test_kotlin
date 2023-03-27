package l6Kot

class Sportsmen {

    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
    //Лямбда функции. НАПОМИНАНИЕ inline разгружает код, делает так,
    // чтобы выполнялись методы, а не создавались объекты анонимного класса для выполнения методов
}