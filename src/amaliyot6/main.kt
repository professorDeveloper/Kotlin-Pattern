package amaliyot6

fun main(args: Array<String>) {
    val securedFile = SecuredFile()
    securedFile.read("myFile.zip") //Bu yerda u parol kiritilmasa notogri deyapti

    securedFile.read("myFile.zip")
    securedFile.password = "1234"//
//Bu yerda esa parol kirilsa ham avval kiritilsh kerakligini anglatadi

    securedFile.password = "1234"//togri natija
    securedFile.read("myFile.zip")

}