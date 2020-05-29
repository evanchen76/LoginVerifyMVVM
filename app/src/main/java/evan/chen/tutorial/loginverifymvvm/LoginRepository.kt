package evan.chen.tutorial.loginverifymvvm

import android.os.Handler

class LoginRepository : ILoginRepository
{
    interface LoginCallback{
        fun loginResult(isLoginSuccess:Boolean)
    }

    override fun login(loginId: String, password: String, listener:LoginCallback) {
        Handler().postDelayed({ listener.loginResult(true) }, 1500)
    }
}
