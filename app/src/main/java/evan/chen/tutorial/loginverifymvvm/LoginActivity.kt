package evan.chen.tutorial.loginverifymvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import evan.chen.tutorial.loginverifymvvm.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = LoginViewModel()

        val dataBinding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        dataBinding.productViewModel = viewModel

        //加這一段就可以讓model有變就更新回UI
        dataBinding.lifecycleOwner = this

        loginButton.setOnClickListener {
            val loginId = loginId.text.toString()
            val password = password.text.toString()

//            viewModel.login(loginId, password).observe(this,
//
//                Observer<Boolean> {
//                    println("observe_change:$it")
//                })
        }
    }
}
