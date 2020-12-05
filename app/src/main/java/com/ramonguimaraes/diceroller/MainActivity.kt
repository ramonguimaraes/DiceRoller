package com.ramonguimaraes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)


        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        result_text.text = randomInt.toString()
    }
}