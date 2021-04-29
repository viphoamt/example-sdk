package com.example.examplesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.createsdktest.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloWorld = HelloWorld()

        val txtText = findViewById<TextView>(R.id.txtHello)
        txtText.text = helloWorld.helloWorld()
    }
}