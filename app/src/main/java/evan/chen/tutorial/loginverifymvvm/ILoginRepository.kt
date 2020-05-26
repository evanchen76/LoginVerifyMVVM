package evan.chen.tutorial.loginverifymvvm

import androidx.lifecycle.LiveData

interface ILoginRepository {
    fun login(user: User): Boolean

}
