package com.example.myandroid_5_0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMenu1 = findViewById<Button>(R.id.buttonMenu1)
        buttonMenu1.setOnClickListener{
            val intent = Intent(this, AndroidStudioActivity::class.java)
            startActivity(intent)
        }

        val buttonMenu2 = findViewById<Button>(R.id.buttonMenu2)
        buttonMenu2.setOnClickListener{
            val intent = Intent(this, KotlnActivity::class.java)
            startActivity(intent)
        }
    }
}