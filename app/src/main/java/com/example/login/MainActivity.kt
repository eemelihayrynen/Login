package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signUp = findViewById<TextView>(R.id.signUp)
        val logIn = findViewById<TextView>(R.id.logIn)
        val sign = findViewById<LinearLayout>(R.id.sign)
        val signIn = findViewById<Button>(R.id.signIn)
        val logInLayout = findViewById<LinearLayout>(R.id.logInLayout)
        signUp.setOnClickListener{
            signUp.background = resources.getDrawable(R.drawable.switch_trcks,null)
            signUp.setTextColor(resources.getColor(R.color.textColor,null))
            logIn.background = null
            sign.visibility = View.VISIBLE
            logInLayout.visibility = View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor,null))
        }
        logIn.setOnClickListener{
            signUp.background = null
            signUp.setTextColor(resources.getColor(R.color.pinkColor,null))
            logIn.background = resources.getDrawable(R.drawable.switch_trcks,null)
            sign.visibility = View.GONE
            logInLayout.visibility = View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.white,null))
        }
        signIn.setOnClickListener{
            startActivity(Intent(this@MainActivity,NewActivity::class.java))
        }

        }
    fun Lazy(){
        LazyColumn {
            // Add a single item
            item {
                Text(text = "placeholder")
            }
            item {
                Text(text = "placeholder 2")
            }
            }
        }
    private fun item(function: () -> Unit) {
    }
}
class LazyColumn(function: () -> Unit) {
}



