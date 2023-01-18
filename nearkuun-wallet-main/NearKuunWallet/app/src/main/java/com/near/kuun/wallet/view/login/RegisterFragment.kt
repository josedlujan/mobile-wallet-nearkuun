package com.near.kuun.wallet.view.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.near.kuun.wallet.R

class RegisterFragment : Fragment() {

    private lateinit var v:View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_register, container, false)

        return v
    }

    companion object {
        @JvmStatic
        fun getInstance() = RegisterFragment()
    }
}