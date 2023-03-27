package l6Kot

class Seller(name: String, age:Int) : Worker(name, age), Cleaner {
    override fun work() {
        println("Sell goods")
    }

    override fun clean() {
        println("I'm Seller and I'm cleaning")
    }
}