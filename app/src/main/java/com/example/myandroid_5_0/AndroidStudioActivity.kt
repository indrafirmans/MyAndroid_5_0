package com.example.myandroid_5_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class AndroidStudioActivity : AppCompatActivity() {

    private lateinit var dede: TextView;
    private var i: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_studio)

        dede = findViewById(R.id.textViewHelloWorld)
    }

    fun pressMe(view: View) {
        val hai: String = dede.text.toString();
        val defaultStr: String = "Hello World";
        Log.d("LOGCURRENTNo", i.toString());

        if (hai === "" || hai !== "Hello World") {
            dede.text = defaultStr;
        } else {
            Log.d("LOGMSG", "2");
            i += 1;
            dede.text = "Latest no: $i";
        }
    }
}