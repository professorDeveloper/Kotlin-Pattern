package amaliyot2

class ChatUser(private val mediator: ChatMediator, val name: String) {
/**Mediator Design Patter tizimdagi turli ob'ektlar o'rtasida markazlashtirilgan aloqa vositasini ta'minlash uchun ishlatiladi. Ushbu naqsh bir nechta ob'ektlar bir-biri bilan o'zaro aloqada bo'lgan korporativ ilovada juda foydali.
Misol:*/
    fun send(msg: String) {
        println("$name: Yuborilgan Habar= $msg")
        mediator.sendMessage(msg, this)
    }

    fun receive(receive:Boolean) {
        println("$name: Qabul qilingan Habar: $receive")
    }
}
