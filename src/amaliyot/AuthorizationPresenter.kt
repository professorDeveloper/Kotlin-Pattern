package amaliyot

class AuthorizationPresenter {
    private var state: AuthorizationState = AuthorizationState.Unauthorized

    val isAuthorized: Boolean
        get() = when (state) {//Get Qilib olyabmiz va when yani Authorized bolsa true qaytar Unauthorized bolsa false qaytar deyapmiz
            is AuthorizationState.Authorized -> true
            is AuthorizationState.Unauthorized -> false
        }

    val userName: String
        get() {
            return when (val state = this.state) { //val holatni aqlli ravishda taqsimlashga imkon beradi
                is AuthorizationState.Authorized -> state.userName //Bu yerda Authorized qilingan yoki Unauthorized ekanligini qaytaradi
                is AuthorizationState.Unauthorized -> "Aziz"
            }
        }

    fun loginUser(userName: String) {
        state = AuthorizationState.Authorized(userName) ///Bu yerda Login User Qilinadi
    }

    fun logoutUser() {
        state = AuthorizationState.Unauthorized //Bu yerda Unauthorized Qiladi
    }

    override fun toString() = "UserName: '$userName' foydalanuvchi tizimga kirdi: $isAuthorized" //Ekranga Chiqariladi !

}