package com.itesm.my_chat_live

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the buttons by their IDs
        val signUpButton: Button = findViewById(R.id.btn_sign_up)
        val loginButton: Button = findViewById(R.id.btn_login)

        // Set click listeners for the buttons
        signUpButton.setOnClickListener {
            // Start SignInActivity
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        loginButton.setOnClickListener {
            // Start LoginActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}