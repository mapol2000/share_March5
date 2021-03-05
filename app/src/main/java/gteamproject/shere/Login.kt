package gteamproject.shere

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // INSERTUSER().execute()
    }

    fun goLogin(v: View){
        val intent = Intent(this, Main::class.java)
        startActivity(intent)
        finish()
    }
}