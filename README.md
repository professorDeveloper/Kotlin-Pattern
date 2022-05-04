# Pattern-Kotlin
My Best The Best
example
package amaliyot7

import FloppyDisk

fun main(args: Array<String>) {
    var cabbinet = Cabbinet()
    cabbinet.add(FloppyDisk())
    cabbinet.add(HardDrive())
    cabbinet.add(Memory())
    println("Cabinet Price: ${cabbinet.getPrice()}")//Bizga Barcha Mahsulotlarni Yigindisini ekranga chiqaradi
}
  
  //Cabinent
  class Cabbinet : Composite("cabbinet")
//open class Compsoite
  package amaliyot7


/*
[composite] Design Pattern nol yoki undan ko'p o'xshash ob'ektlarni yaratish uchun ishlatiladi,
 shunda ularni bitta ob'ekt sifatida boshqarish mumkin !
 Masalan:
*/
open class Composite(name: String) : Equipment(0, name) {
    val equipments = ArrayList<Equipment>()

    fun add(equipment: Equipment) {
        this.equipments.add(equipment)
    }

    override fun getPrice(): Int {
        return equipments.sumOf { it.getPrice() }
    }
}
//open class equipments
  
open class Equipment(private var price: Int, private var name: String) {
    open fun getPrice(): Int = price
}
