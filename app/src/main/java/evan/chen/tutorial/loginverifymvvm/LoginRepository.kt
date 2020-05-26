package evan.chen.tutorial.loginverifymvvm

class LoginRepository : ILoginRepository
{
    override fun login(user: User): Boolean {
       return true
    }
}
