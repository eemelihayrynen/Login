package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    private lateinit var SharedPreferences : SharedPreferences
    private lateinit var username : String
    private lateinit var tvData : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        checkLogin()
        val signUp = findViewById<TextView>(R.id.signUp)
        val logIn = findViewById<TextView>(R.id.logIn)
        val sign = findViewById<LinearLayout>(R.id.sign)
        val signIn = findViewById<Button>(R.id.signIn)
        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        signUp.setOnClickListener {
            signUp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            signUp.setTextColor(resources.getColor(R.color.textColor, null))
            logIn.background = null
            sign.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor, null))
        }
        logIn.setOnClickListener {
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.pinkColor, null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks, null)
            sign.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.white, null))
        }
        signIn.setOnClickListener {
            startActivity(Intent(this@MainActivity, NewActivity::class.java))
        }

    }
    private fun init(){
        SharedPreferences = SharedPreferences(this)
        username = SharedPreferences.getUsername().toString()
    }
    private fun checkLogin(){
        if (SharedPreferences.is_Login() == false){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
            finish()
        }
    }



}



