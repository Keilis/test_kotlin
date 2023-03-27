import java.util.Calendar
import javax.xml.crypto.Data

class Employee(val name: String, val vocation: String, val year: Int) {
    fun work() = println("Work")

    val data = Calendar.getInstance().weekYear
    fun workYear() = data - year

//    val experience: Int
//    get() = Calendar.getInstance().get(Calendar.YEAR) - year


//    fun printInfo() {
//       println("Name: $name Vocation: $vocation Year Start: $year Work Year: ${workYear()}")
//    } - фишка е.функции в том что она расширяет нужный класс, не надо дублировать

}