package com.ramonguimaraes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    lateinit var dice1: ImageView
    lateinit var dice2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dice1 = findViewById(R.id.dice_image1)
        dice2 = findViewById(R.id.dice_image2)

        val rollButton: Button = findViewById(R.id.roll_button)


        rollButton.setOnClickListener {
            dice1.setImageResource(setDiceImage())
            dice2.setImageResource(setDiceImage())
        }


    }

    private fun setDiceImage(): Int {

        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

    }

}