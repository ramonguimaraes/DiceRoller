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
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.dice_image)

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

        val drawableResource = when (diceFace) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }

        imageView.setImageResource(drawableResource)

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