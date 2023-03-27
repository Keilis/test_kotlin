package l6Kot

class Programmer(name: String, age: Int, val language: String) : Worker (name, age), Cleaner {
    override fun work() {
        println("I'm writing a programmer on $language")
    }

    override fun clean() {
        println("I'm programmer and I'm cleaning")
    }
}