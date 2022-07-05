package com.example.myhelloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener{ rollDice() }
    }

    private fun rollDice(){
        Toast.makeText( this, "Button Clicked", Toast.LENGTH_SHORT).show()

        val randomNumb = (1..6).random()

        val numberText : TextView = findViewById(R.id.numberText)
        numberText.text = randomNumb.toString()
        Toast.makeText( this, randomNumb.toString(), Toast.LENGTH_SHORT).show()
    }
}