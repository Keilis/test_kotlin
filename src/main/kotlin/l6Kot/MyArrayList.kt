package l6Kot

import java.lang.IndexOutOfBoundsException

class MyArrayList<T> : MyList<T> {

    //массив эллементов обобщенного типа создать нельзя, поэтому в угловых скобках Any (родительский тип)
    //так как нужно выделить память, а под тип Т неизвестно, сколько памяти выделять
    var array = arrayOfNulls<Any>(10)
    var size = 0

    //получение данных из массива. С проверкой на ненулабельность и с броском на исключения
    override fun get(index: Int): T {
        if (index in 0 until size) {
            //а здесь мы делаем явное приведение типов из родительского any к Т
            array[index]?.let { return it as T }
        }
        throw IndexOutOfBoundsException()
    }

    override fun add(string: T) {
        //Это условие создаёт новый массив в два раза больше предыдущего,
        // если первый заканчивается. С копированием в него эллементов из предыдущего массива
        if (size >= array.size) {
            array = array.copyOf(array.size * 2)
        }
        array[size] = string
        size++
    }

    override fun remove(element: T) {
        for ((index, string) in array.withIndex()) {
            if (string == element) {
                removeAt(index)
                return
            }
        }
    }

    override fun removeAt(index: Int) {
        //Удаляем эллемент по индексу. А значит сдвигаем все остальные на один индекс ниже. Так как длина массива с 0, то сайз -1
        //то есть в ячейке 2 теперь будет лежать значение из ячейки 3(2+1)
        if (index in 0 until size) {
            for (i in index until size - 1) {
                array[i] = array[i + 1]
            }
            size--
        } else {
            throw IndexOutOfBoundsException()
        }

    }

    override fun size(): Int {
        return size
    }
}