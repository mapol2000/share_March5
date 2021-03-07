package gteamproject.shere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.google.android.material.bottomnavigation.BottomNavigationView

class Main : AppCompatActivity(){

    private lateinit var home: Home
    private lateinit var magazine: Magazine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<View>(R.id.bottom_nav) as BottomNavigationView
        bottomNavigationView.setOnNavigationItemSelectedListener(onBottomNavigationItemSelectedListener)

        home = Home.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragment_frame, home).commit()
    }

    private val onBottomNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        when(it.itemId){
            R.id.menu_home -> {
                home = Home.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_frame, home).commit()
            }

            R.id.menu_magazine -> {
                magazine = Magazine.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.fragment_frame, magazine).commit()
            }

        }
        true
    }


}