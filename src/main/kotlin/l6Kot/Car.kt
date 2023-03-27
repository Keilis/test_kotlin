package l6Kot

class Car (override var name: String = "Car") : Transport(name) {
    //var означает что у переменной есть и сеттер и геттер
    override fun drive() {
        println("Car is riding")
    }
    fun startEngine() : Boolean {
        println("Engine have been started successfully")
        return true
    }
}