package com.example.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity {
    private lateinit var SharedPreferences : SharedPreferences
    private lateinit var etUsername : EditText
    private lateinit var etPassword : EditText
    private lateinit var username : String
    private lateinit var password : String

    private var validUsername = "eemeli"
    private var validPassword = "1234"
    private fun init(){
        SharedPreferences = SharedPreferences(this)
        etUsername = findViewById(R.id.email)
        etPassword = findViewById(R.id.passwords)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        checkLogin()}
    private fun checkLogin(){
        if (SharedPreferences.is_Login()!!){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    fun clickLogin(view : View){
        username = etUsername.text.toString().trim()
        password = etPassword.text.toString().trim()

        if (username.isEmpty() || username == ""){
            etUsername.error = "Username was invalid"
            etUsername.requestFocus()
        } else if (password.isEmpty() || password == ""){
            etPassword.error = "Password was invalid"
            etPassword.requestFocus()
        } else if (username != validUsername){
            etUsername.error = "Username is incorrect"
            etUsername.requestFocus()
        }else if (password != validPassword){
            etPassword.error = "Password is incorrect"
            etPassword.requestFocus()
        } else{
            SharedPreferences.setLogin(true)
            SharedPreferences.setUsername(username)

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}