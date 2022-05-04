package amaliyot5

/**Facade Pattern namunasi yanada murakkab quyi tizimga soddalashtirilgan interfeysni aniqlash uchun ishlatiladi.
*/
class UserRepository {
    private val systemPreferences = ComplexSystemStore("myfile/pdp/amaliyot5")
//Togrioq tushuntirilganda Facade Pattern Interface aniqlash Pattern hisoblandi
    fun save(user: User) {
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst(): User = User(systemPreferences.read("USER_KEY"))
}