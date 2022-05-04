package amaliyot4

sealed class Country {
    //Sealed Class
    /**Factory  Pattern sinf konstruktorlarini almashtirish uchun ishlatiladi, ob'ektni yaratish jarayonini mavhumlashtiradi, shuning uchun ishga tushirilgan ob'ekt turini ish vaqtida aniqlash mumkin.*/

object UZB : Country()//
    object USA : Country() //
// Mahsulotlar qanday yaratilganligini bilish shart bo'lmaganda Factory pattern qollaniladi !
}

class Russian(val someProperty: String) : Country()
data class UK(val someProperty: String) : Country()
object Poland : Country()


