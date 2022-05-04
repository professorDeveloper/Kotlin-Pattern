package amaliyot

sealed class AuthorizationState {
    /** state pattern  ob'ektning ichki holati o'zgarganda uning xatti-harakatlarini o'zgartirish uchun ishlatiladi. Shakl ish vaqtida ob'ekt sinfini o'zgartirishga imkon beradi.

     */
    object Unauthorized : AuthorizationState()

    class Authorized(val userName: String) : AuthorizationState()

}