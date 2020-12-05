package com.ramonguimaraes.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {

    var diceFace: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUp: Button = findViewById(R.id.count_up)
        val reset: Button = findViewById(R.id.reset_button)

        rollButton.setOnClickListener {
            rollDice()
        }

        countUp.setOnClickListener {
            countUp()
        }

        reset.setOnClickListener {
            reset()
        }

    }

    private fun setDiceImage() {

        val diceImage: ImageView = findViewById(R.id.dice_image)

        when (diceFace) {
            1 -> {
                diceImage.setImageResource(R.drawable.dice_1)
                diceImage.contentDescription = "1"
            }
            2 -> {
                diceImage.setImageResource(R.drawable.dice_2)
                diceImage.contentDescription = "2"
            }
            3 -> {
                diceImage.setImageResource(R.drawable.dice_3)
                diceImage.contentDescription = "3"
            }
            4 -> {
                diceImage.setImageResource(R.drawable.dice_4)
                diceImage.contentDescription = "4"
            }
            5 -> {
                diceImage.setImageResource(R.drawable.dice_5)
                diceImage.contentDescription = "5"
            }
            6 -> {
                diceImage.setImageResource(R.drawable.dice_6)
                diceImage.contentDescription = "6"
            }
        }

    }

    private fun rollDice() {
        diceFace = (1..6).random()
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        setDiceImage()
    }

    private fun countUp() {
        if (diceFace < 6) {
            diceFace += 1
            setDiceImage()
        }
    }

    fun reset() {
        diceFace = 1
        setDiceImage()
    }
}