package evan.chen.tutorial.loginverifymvvm

interface ILoginRepository {
    fun login(loginId: String, password: String): Boolean

}
