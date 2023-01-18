package com.near.kuun.wallet.view.wallet

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.near.kuun.wallet.R
import kotlinx.android.synthetic.main.activity_main_wallet.*

class MainWalletActivity : AppCompatActivity() {

    private var walletBalanceFragment = WalletBalanceFragment.getInstance()
    private var walletAccountFragment = WalletAccountFragment.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_wallet)

        supportFragmentManager.beginTransaction()
            .add(R.id.main_wallet_container, walletBalanceFragment)
            .commit()

        wallet_toolbar.title = ""
        wallet_toolbar.inflateMenu(R.menu.nav_wallet_toolbar_menu)

        toolbar_drawer_menu.setOnClickListener{
            drawer_layout.openDrawer(Gravity.LEFT)
        }

        wallet_toolbar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.firstItem -> {
                    Toast.makeText(this, "Toolbar Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.secondtItem -> {
                    Toast.makeText(this, "Toolbar Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.thirdItem -> {
                    Toast.makeText(this, "Toolbar Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    true
                }
            }
        }

        nav_view.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.firstItem -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_wallet_container, walletBalanceFragment)
                        .commit()
                    drawer_layout.closeDrawers()
                    true
                }
                R.id.secondtItem -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.main_wallet_container, walletAccountFragment)
                        .commit()
                    drawer_layout.closeDrawers()
                    true
                }
                R.id.thirdItem -> {
                    Toast.makeText(this, "Third Item Clicked", Toast.LENGTH_SHORT).show()
                    drawer_layout.closeDrawers()
                    true
                }
                else -> {
                    true
                }
            }

        }

    }

}