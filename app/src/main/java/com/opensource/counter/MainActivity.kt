package com.opensource.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countNum: Int = 0
        fun addNum():Int{
            countNum++
            return countNum
        }

        val btn: Button = findViewById(R.id.btn)
        val num: TextView = findViewById(R.id.num)
        btn.setOnClickListener() {
            num.setText(""+addNum())
        }

    }
}

