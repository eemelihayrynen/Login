package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.w3c.dom.Text

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
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
