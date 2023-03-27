class Cat(val name: String, val age: Int, val weight: Float) {
    private val isOld: Boolean

        get() = age>=10

    fun printInfo(){
        println("Name: $name Age: $age Weight: $weight Old? $isOld")
    }
}