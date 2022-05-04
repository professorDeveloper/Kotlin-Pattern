package amaliyot2

class ChatMediator {
//Bu yerda Mediator Design Pattern Ishlamoqda
    private val users: MutableList<ChatUser> = ArrayList()

    fun sendMessage(msg: String, user: ChatUser) {
        users
            .filter { it != user }
            .forEach {
                it.receive(true)
            }
    }//Habar Yuborish

    fun addUser(user: ChatUser): ChatMediator =
        apply { users.add(user) }
//User Qoshish
}