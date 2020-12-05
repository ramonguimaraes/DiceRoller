package com.ramonguimaraes.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        val countUp: Button = findViewById(R.id.count_up)

        rollButton.setOnClickListener {
            rollDice()
        }

        countUp.setOnClickListener {
            countUp()
        }

    }

    private fun countUp() {
        val res = result_text.text.toString()
        try {
            val inteiro: Int = res.toInt()

            if (inteiro < 6) {
                result_text.text = (inteiro + 1).toString()
            }

        } catch (e: NumberFormatException) {
            result_text.text = "1"
        }


    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        result_text.text = randomInt.toString()
    }
}