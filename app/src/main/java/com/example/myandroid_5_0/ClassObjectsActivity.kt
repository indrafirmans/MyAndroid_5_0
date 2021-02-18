package com.example.myandroid_5_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.time.Year
import java.util.logging.Logger

class ClassObjectsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class_objects)

        val vehicles = listOf<Cars>(Cars("FACTORY", "OLDSCHOOL", 1980, 1), Cars("Planes", "Boing", 2019, 999))

        for (vehicle in vehicles) {
            vehicle.trip(true)
        }
    }
}

open class Vehicle() {
    var needsMaintenance: Boolean = false;
    var tripsSinceMaintenance: Int = 0;

    open fun trip(isDriving: Boolean = false) {
        println("START")
    }
}

class Cars(make: String, model: String, year: Int, weight: Int): Vehicle() {
    val make: String = make;
    val model: String = model;
    val year: Int = year;
    val weight: Int = weight;
    var isDriving: Boolean = false

    override fun trip(isDriving: Boolean) {
        println("make: ${this.make} / model: ${this.model} / year: ${this.year} / weight: ${this.weight}")
        if (isDriving) {
            drive();
            for (i in 1..100) {
                if (i >= 95) {
                    println("i ==> $i")
                }
                if (i === 100) {
                    this.needsMaintenance = true;
                    println("MAINTAIN ${this.needsMaintenance.toString()}")
                    if (this.needsMaintenance) {
                        repair();
                    }
                }
            }
        } else {
            stop();
        }
    }

    private fun drive() {
        isDriving = true
        println("isDriving: $isDriving")
    }

    private fun stop() {
        isDriving = false
        println("isDriving: $isDriving")
    }

    private fun repair() {
        this.tripsSinceMaintenance = 0
        this.needsMaintenance = false
        println("this.tripsSinceMaintenance: ${this.tripsSinceMaintenance}")
        println("this.needsMaintenance: ${this.needsMaintenance}")
    }
}