package evan.chen.tutorial.loginverifymvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var loginId: MutableLiveData<String> = MutableLiveData()
    var password: MutableLiveData<String> = MutableLiveData()
    var loginSuccess: MutableLiveData<Boolean> = MutableLiveData()

    fun login(userId: String, password: String) {
        val user = User()
        user.userId = userId
        user.password = password

        val loginRepository = LoginRepository()

        loginSuccess.value = loginRepository.login(user)
    }
}