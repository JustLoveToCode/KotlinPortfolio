package com.mastercoding.navigationdrawerapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    drawerLayout = findViewById(R.id.drawerLayout)
    toggle = ActionBarDrawerToggle(
        this@MainActivity,
        drawerLayout,
        R.string.open,
        R.string.close

    )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Functionalities for the Nav Drawer Items
        var navView: NavigationView = findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId){
                R.id.home->{
                    replaceFragment(HomeFragment(),it.title.toString())
                }
                R.id.message->{
                    replaceFragment(MessageFragment(),it.title.toString())
                }
                R.id.settings->{
                    replaceFragment(SettingsFragment(),it.title.toString())
                }
                R.id.login->{
                    replaceFragment(LoginFragment(),it.title.toString())
                }

            }

            true
        }

    }
    private fun replaceFragment(fragment: Fragment, title: String){
        val fragmentmanager = supportFragmentManager
        val fragTrans = fragmentmanager.beginTransaction()
        fragTrans.replace(R.id.frame_layout_1,fragment)
        fragTrans.commit()

        drawerLayout.closeDrawers()
        setTitle(title)

    }
    override fun onOptionsItemSelected(item: MenuItem):Boolean{
        if(toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)

    }


}
