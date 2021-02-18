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

        val buttonMenu3 = findViewById<Button>(R.id.buttonMenu3)
        buttonMenu3.setOnClickListener{
            val intent = Intent(this, CollectionsActivity::class.java)
            startActivity(intent)
        }

        val buttonMenu4 = findViewById<Button>(R.id.buttonMenu4)
        buttonMenu4.setOnClickListener{
            val intent = Intent(this, ControlFlowActivity::class.java)
            startActivity(intent)
        }

        val buttonMenu5 = findViewById<Button>(R.id.buttonMenu5)
        buttonMenu5.setOnClickListener{
            val intent = Intent(this, FunctionActivity::class.java)
            startActivity(intent)
        }

        val buttonMenu6 = findViewById<Button>(R.id.buttonMenu6)
        buttonMenu6.setOnClickListener{
            val intent = Intent(this, ClassObjectsActivity::class.java)
            startActivity(intent)
        }
    }
}