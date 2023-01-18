package com.near.kuun.wallet.view.login

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.near.kuun.wallet.R



class SplashScreenFragment : Fragment() {

    private lateinit var v:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_splash_screen, container, false)

        val loginBtn = v.findViewById<TextView>(R.id.login_button)
        val registerBtn = v.findViewById<TextView>(R.id.register_button)

        loginBtn.setOnClickListener {
            (activity as MainActivity).navigateToLogin()
        }

        registerBtn.setOnClickListener {
            (activity as MainActivity).navigateToRegister()
        }

        return v
    }

    companion object {
        @JvmStatic
        fun getInstance() = SplashScreenFragment()
    }
}