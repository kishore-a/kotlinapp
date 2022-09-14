package com.example.demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)
        val button3=findViewById<Button>(R.id.button3)

        button1.setOnClickListener{
            Toast.makeText(this,"Button1 is clicked",Toast.LENGTH_SHORT).show()
        }
        button2.setOnClickListener{
            Toast.makeText(this,"Button2 is clicked",Toast.LENGTH_SHORT).show()

        }
        button3.setOnClickListener{
            Toast.makeText(this,"Button3 is clicked",Toast.LENGTH_SHORT).show()

        }
    }
}