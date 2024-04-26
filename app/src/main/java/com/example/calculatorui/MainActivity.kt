package com.example.calculatorui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculatorui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var result: Int
        result = 0

        //The with statement assumes everything inside the {} is with the context of binding
        with(binding) {
            val numberButtons = listOf(
                btnZero, btnOne, btnTwo, btnThree,
                btnFour, btnFive, btnSix, btnSeven,
                btnEight, btnNine
            )

            //Iterates through each numberButton and sets an onClickListener that changes the text of result
            //depending on what button was pressed
            numberButtons.forEach { button ->
                button.setOnClickListener {
                    val number = button.text.toString().toInt()
                    result = number
                    resultView.text = result.toString()
                }
            }
        }
    }
}