package l6Kot

class Director(name: String, age: Int) : Worker(name, age) {
    override fun work() {
        println("Control the process")
    }
}