package amaliyot4

fun main(args: Array<String>) {
    /**Factory Design Pattern Afzalligi :
    1-> Factory Pattern sinfi va usuli yordamida kodning takrorlanishini olib tashlash
    2->Factory Pattern  sinfida ob'ekt yaratish mexanizmini birlashtirish orqali kod izchilligini saqlash
    3->  Tizimning kod sifatini ta'minlaydigan interfeys printsipiga dasturlashni rag'batlantirish
     **/

    val uzbCurrency = CurrencyFactory.currencyForCountry(Country.UZB).code
    println("UZB currency: $uzbCurrency")

    val usaCurrency = CurrencyFactory.currencyForCountry((Country.USA)).code
    println("USA currency: $usaCurrency")

    val russianCurrency = CurrencyFactory.currencyForCountry((Russian("Ruble"))).code
    println("Russian currency: $russianCurrency")

    val ukCurrency = CurrencyFactory.currencyForCountry((UK("Pound Sterling"))).code
    println("UK currency: $ukCurrency")
/**
Ob'ektni yaratish uchun interfeysni aniqlang, lekin quyi sinflarga qaysi sinfni yaratishni tanlashiga ruxsat bering. Factory Patterm sinfga quyi sinflarga instantsiyani kechiktirishga imkon beradi.

 * */
}