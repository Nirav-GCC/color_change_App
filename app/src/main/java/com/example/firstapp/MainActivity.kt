package com.example.firstapp

import android.graphics.Color
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonhot = findViewById<Button>(R.id.btnHot)
        val buttoncool = findViewById<Button>(R.id.btnCool)
        val linearLayout = findViewById<LinearLayout>(R.id.linearLayout)
        val textView = findViewById<TextView>(R.id.textView3)


        buttoncool.setOnClickListener{
            //set to pink
            textView.setTextColor(Color.BLACK)
            linearLayout.setBackgroundColor(Color.BLUE)
        }
        buttonhot.setOnClickListener{
            //set to black
            textView.setTextColor(Color.WHITE)
            linearLayout.setBackgroundColor(Color.BLACK)
        }
    }
}