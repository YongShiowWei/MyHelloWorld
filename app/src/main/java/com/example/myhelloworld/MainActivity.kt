package com.example.myhelloworld

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     lateinit var diceImg : ImageView //create once and reuse
     lateinit var numberText : TextView
     //val -> value cannot change (constant)
     //var -> value can change
    // var diceImg : ImageView? = null //make sure not null to prevent null pointer exception
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //content prepared
         diceImg = findViewById(R.id.diceImage)
         numberText = findViewById(R.id.numberText)
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener{ rollDice() }
    }

    private fun rollDice(){
        Toast.makeText( this, "Button Clicked", Toast.LENGTH_SHORT).show()

        val randomNumb = (1..6).random()
        //val numberText : TextView = findViewById(R.id.numberText)
        numberText.text = randomNumb.toString()
        // val diceImg : ImageView = findViewById(R.id.diceImage)
        val imgSrc = when (randomNumb){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImg.setImageResource(imgSrc)
        Toast.makeText( this, randomNumb.toString(), Toast.LENGTH_SHORT).show()
    }
}