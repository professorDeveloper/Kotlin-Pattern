package amaliyot5

class ComplexSystemStore(val filePath: String) {
//Facade Design Pattern
    init {
    println("=========================================")
    println("Fayldan ma'lumotlarni o'qilmoqda")
    Thread.sleep(500)
    print("Kuting")
    Thread.sleep(500)
    print(".")
    Thread.sleep(500)
    print(".")
    Thread.sleep(500)
    println(".")

    println("Fayldan ma'lumotlarni o'qildi: $filePath")
    println("=========================================")

}

    val store = HashMap<String, String>()

    fun store(key: String, payload: String) {
        store.put(key, payload)
    }

    fun read(key: String): String = store[key] ?: ""

    fun commit() {
        println("##########################################")

        println("Keshlangan ma'lumotlarni saqlanmoqda")
        Thread.sleep(500)
        print("Kuting")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        print(".")
        Thread.sleep(500)
        println(".")
        println("Keshlangan ma'lumotlarni saqlandi: $store faylga: $filePath")
        println("##########################################")


    }}