package l6Kot

fun main() {
    //Создание коллекции, которая использует обобщенный тип Т
    //Вместо Int можно сделать String и всё также будет работать
val list: MyList<Int> = MyArrayList()
    for (i in 0..100){
        list.add(i)
    }
    for (i in 0..90) {
        list.removeAt(0)
    }
    for (i in 0 until list.size()) {
        println(list.get(i))
    }
}