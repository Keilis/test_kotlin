
fun main() {

val employee = Employee("Tom", "Trader", 2015)
    employee.printInfo()
}
fun Employee.printInfo() = println("Name: $name Vocation: $vocation Year Start: $year Work Year: ${workYear()} Now: ${work()}")