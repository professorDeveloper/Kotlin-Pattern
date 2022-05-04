package amaliyot4

object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Russian -> Currency("Ruble")
            is Country.USA -> Currency("USD")
            is Country.UZB -> Currency("SOM")
            is UK -> Currency("Pound Sterling")
            is Poland-> Currency("złoty")
        }
    //Factory Design Pattern  yaratgan ob'ektlar interfeysini belgilaydi
}