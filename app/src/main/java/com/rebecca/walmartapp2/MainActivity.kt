package com.rebecca.walmartapp2

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val uemail: TextView = findViewById(R.id.uemailTV)
        uemail.setText("userEmail@email.com")

        val cat1: ImageView = findViewById(R.id.tv)
        cat1.setOnClickListener(this)
        val cat2: ImageView = findViewById(R.id.jack)
        cat2.setOnClickListener(this)
        val cat3: ImageView = findViewById(R.id.lip)
        cat3.setOnClickListener(this)
        val cat4: ImageView = findViewById(R.id.food)
        cat4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv -> {
                Toast.makeText(this, "Electronics", Toast.LENGTH_LONG).show()
            }
            R.id.jack -> {
                Toast.makeText(this, "Clothing.", Toast.LENGTH_LONG).show()
            }
            R.id.lip -> {
                Toast.makeText(this, "Beauty", Toast.LENGTH_LONG).show()
            }
            R.id.food -> {
                Toast.makeText(this, "Food", Toast.LENGTH_LONG).show()
            }
        }
    }
}