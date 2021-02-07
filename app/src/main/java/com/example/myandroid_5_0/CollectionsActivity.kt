package com.example.myandroid_5_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class CollectionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collections)

    //        The major difference from usage side is that Arrays have a fixed size while (Mutable)List can adjust their size dynamically.
    //        Moreover Array is mutable whereas List is not.

        val numbers = listOf<String>("one", "two", "three", "four");
        for (number in numbers) {
            Log.d("ListOf", number);
        }

        val counts = arrayOf<Int>(1, 2, 3, 4, 5);
        for (count in counts) {
            Log.d("arrayOf", count.toString());
        }

    //        Note that altering a mutable collection doesn't require it to be a var: write operations modify the same mutable collection object,
    //        so the reference doesn't change. Although, if you try to reassign a val collection, you'll get a compilation error.
        val numbersMutable = mutableListOf<String>("one", "two", "three", "four");
        numbersMutable.add("five")
        for (data in numbersMutable) {
            Log.d("arrayOf", data.toString());
        }
    }
}