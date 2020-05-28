package evan.chen.tutorial.loginverifymvvm

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    var loginId: MutableLiveData<String> = MutableLiveData()
    var password: MutableLiveData<String> = MutableLiveData()
    var loginSuccess: MutableLiveData<Boolean> = MutableLiveData()

    private val _snackbarText = MutableLiveData<Event<String>>()
    val snackbarText: LiveData<Event<String>> = _snackbarText

    fun login() {

        val currentLoginId = loginId.value
        val currentPassword = password.value

        if (currentLoginId == null || currentPassword == null) {
            _snackbarText.value = Event("帳號不能是空白")
            return
        }


        val user = User()
        user.userId = currentLoginId
        user.password = currentPassword

        val loginRepository = LoginRepository()

        loginSuccess.value = loginRepository.login(user)
    }

}