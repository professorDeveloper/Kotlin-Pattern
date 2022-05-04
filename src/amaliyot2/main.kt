package amaliyot2

import java.util.Scanner

fun main(args: Array<String>) {
    val mediator = ChatMediator()//Mediator Patterndan chaqirib olyapmiz !
    var scanner =Scanner(System.`in`)
    println("Name :")
    var name =scanner.next()
    println("Send Message: ")
    var sendMessage =scanner.next()
    val john = ChatUser(mediator, name)
    mediator //Ishlatilishi
        .addUser(ChatUser(mediator, "Aziz"))
        .addUser(ChatUser(mediator, "Unknown"))
        .addUser(john)
    john.send(sendMessage)


}