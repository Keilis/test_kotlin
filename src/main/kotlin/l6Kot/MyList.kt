package l6Kot
//если нужно использовать какой-то обобщенный тип, Generic, его указывают в угловых скобках

interface MyList<T> {
    fun get(index: Int): T
    fun add(string:T)
    fun remove (element: T)
    fun removeAt (index: Int)
    fun size(): Int
}