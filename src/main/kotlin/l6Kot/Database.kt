package l6Kot

object Database {
    val name = "name.db"
    val version = 1
    val data = mutableListOf<String>()
    fun insertData(str: String) {
        data.add(str)
    }
}