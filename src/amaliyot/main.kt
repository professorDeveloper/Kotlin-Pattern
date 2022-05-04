package amaliyot

import java.util.Scanner

fun main(args: Array<String>) {
    val authorizationPresenter = AuthorizationPresenter()
    authorizationPresenter.loginUser("Hasanxon")//Login Admin Name
    println(authorizationPresenter)//Tekshirib Ekranga chiqarilishi

    authorizationPresenter.logoutUser()//Log out
    println(authorizationPresenter)//Ekranga chiqarish

}