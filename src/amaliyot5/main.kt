package amaliyot5

import java.util.Scanner

fun main() {
    var scanner =Scanner(System.`in`)
    println("Find File Login:")
    var fileLogin =scanner.next()
    print("Qidirilmoqda")
    Thread.sleep(500)
    print(".")
    Thread.sleep(500)
    print(".")
    Thread.sleep(500)
    println(".")
    val userRepository = UserRepository()
    val user = User(fileLogin)
    userRepository.save(user)

    val resultUser = userRepository.findFirst()//Facade Deisgn pattern ishlatilishi
    println("Saqlangan foydalanuvchi topildi: $resultUser")
}