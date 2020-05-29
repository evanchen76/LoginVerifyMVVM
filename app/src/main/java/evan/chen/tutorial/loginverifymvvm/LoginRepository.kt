package evan.chen.tutorial.loginverifymvvm

class LoginRepository : ILoginRepository
{
    override fun login(loginId: String, password: String): Boolean {
       return true
    }
}
