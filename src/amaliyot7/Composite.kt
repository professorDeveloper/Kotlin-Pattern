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
