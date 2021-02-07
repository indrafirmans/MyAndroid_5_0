package com.example.myandroid_5_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class KotlnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotln)

        val title: String = "Matamu"; Log.d("Title", title + " / ${title::class.java.simpleName}");
        val singer: String = "Titi DJ"; Log.d("Singer", singer + " / ${singer::class.java.simpleName}");
        val release: Int = 2003; Log.d("Release", release.toString() + " / ${release::class.java.simpleName}");
        val genre: String = "POP"; Log.d("Genre", genre + " / ${genre::class.java.simpleName}");
        val duration: String =  "3 minuts 51"; Log.d("Duration", duration + " / ${duration::class.java.simpleName}");
        /*  ===== snippets of lyrics =====
            Kini aku melihat
            Kilau matamu itu
            Lega aku tersenyum
            Dan kupercaya
            Dan masih 'ku melihat
            Sepasang kehangatan
            Sehangat mata itu
        * */

        // Numbers
        val threeBillion: Long = 3000000000; Log.d("threeBillion", threeBillion.toString() + " / ${threeBillion::class.java.simpleName}"); // Long
        val oneByte: Byte = 1; Log.d("oneByte", oneByte.toString() + " / ${oneByte::class.java.simpleName}");
        val pi: Double = 3.14; Log.d("pi", pi.toString() + " / ${pi::class.java.simpleName}"); // Double
        val eFloat: Float = 2.7182818284f; Log.d("eFloat", eFloat.toString() + " / ${eFloat::class.java.simpleName}"); // Float, actual value is 2.7182817
        val r: Int = 2; Log.d("r", r.toString() + " / ${r::class.java.simpleName}");
        val circleVolume: Double = (pi * (r * r)) * 100 / 100; Log.d("circleVolume", circleVolume.toString() + " / ${circleVolume::class.java.simpleName}");

        for (i in 1..5) {
            if (i % 2 == 0)
                Log.d("EVEN","$i is even");
            else
                Log.d("ODD", "$i is odd");
        }
    }
}