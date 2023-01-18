package com.near.kuun.wallet.view.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.near.kuun.wallet.R

class MainActivity : AppCompatActivity() {

    private var splashFragment = SplashScreenFragment.getInstance()
    private var loginFragment = LoginFragment.getInstance()
    private var registerFragment = RegisterFragment.getInstance()

    companion object {
        const val SPLASH_SCREEN_FRAGMENT_TAG = "splashScreenFragment"
        const val LOGIN_FRAGMENT_TAG = "LoginFragment"
        const val REGISTER_FRAGMENT_TAG = "RegisterFragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_container, splashFragment)
            .addToBackStack(SPLASH_SCREEN_FRAGMENT_TAG)
            .commit()

    }

    fun navigateToLogin(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, loginFragment)
            .addToBackStack(LOGIN_FRAGMENT_TAG)
            .commit()
    }

    fun navigateToRegister(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, registerFragment)
            .addToBackStack(REGISTER_FRAGMENT_TAG)
            .commit()
    }

    fun navigateBackToSplash(){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, splashFragment)
            .addToBackStack(SPLASH_SCREEN_FRAGMENT_TAG)
            .commit()
    }

    override fun onBackPressed() {
        navigateBackToSplash()
    }
}