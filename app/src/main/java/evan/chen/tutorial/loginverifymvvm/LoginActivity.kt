package evan.chen.tutorial.loginverifymvvm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.google.android.material.snackbar.Snackbar
import evan.chen.tutorial.loginverifymvvm.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        viewModel = LoginViewModel()

        val dataBinding =
            DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        dataBinding.viewModel = viewModel

        dataBinding.lifecycleOwner = this

        setupSnackbar()

    }

    private fun setupSnackbar() {
        viewModel.snackBarText.observe(this, Observer { event ->
            event.getContentIfNotHandled()?.let {
                val snackBarText = it
                Snackbar.make(layoutView, snackBarText, Snackbar.LENGTH_LONG).show()
            }
        })
    }
}
