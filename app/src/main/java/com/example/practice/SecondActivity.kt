  package com.example.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

  class SecondActivity : AppCompatActivity() {
      lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tv = findViewById(R.id.tvText)

        val data = intent.extras
        val id = data?.getString("value1")
        tv.text = id
        Toast.makeText(this,id,Toast.LENGTH_LONG).show()









    }
}