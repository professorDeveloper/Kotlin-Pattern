package amaliyot6

class SecuredFile : File {
//Proxy design Pattern asosiy ob'ektga havola qiluvchi surrogat yoki to'ldiruvchi ob'ektni ta'minlash uchun ishlatiladi.
// Himoya proksi-server kirishni cheklamoqda.
    val normalFile = NormalFile()
    var password: String = ""

    override fun read(name: String) {
        if (password == "1234") {
            println("Password is correct: $password")
            normalFile.read(name)
        } else {
            println("Incorrect password. Access denied!")
        }
    }
}