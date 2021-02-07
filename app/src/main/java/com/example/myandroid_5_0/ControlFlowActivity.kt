package com.example.myandroid_5_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ControlFlowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_control_flow)

        for (i in 1..100) {
            if (i % 3 == 0 && i % 5 == 0) {
                Log.d("FizzBuzz-$i", "FizzBuzz")
            } else if (i % 3 == 0) {
                Log.d("Fizz-$i", "Fizz")
            } else if (i % 5 == 0) {
                Log.d("Buzz-$i", "Buzz")
            } else {
                Log.d("Prime-$i", "Prime")
            }
        }
    }
}