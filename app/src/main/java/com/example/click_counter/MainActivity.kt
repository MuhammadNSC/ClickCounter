package com.example.click_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var counterTextView: TextView
    private var counterValue: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get a reference to the TextView component
        counterTextView = findViewById(R.id.counter_textview)
        // Set the initial value of the TextView
        counterTextView.text = counterValue.toString()
        // Get a reference to the Increment button
        val incrementButton: Button = findViewById(R.id.btn_Increment)

        // Set an OnClickListener on the Increment button
        incrementButton.setOnClickListener {
            val previousValue = counterValue
            counterValue++
            counterTextView.text = counterValue.toString()
            val message = "Increment: $previousValue -> $counterValue"
            showToast(message)
        }

        // Get a reference to the Decrement button
        val decrementButton: Button = findViewById(R.id.btn_Decrement)
        // Set an OnClickListener on the Decrement button
        decrementButton.setOnClickListener {
            val previousValue = counterValue
            counterValue--
            counterTextView.text = counterValue.toString()
            val message = "Decrement: $previousValue -> $counterValue"
            showToast(message)
        }
        // Get a reference to the Reset button
        val resetButton: Button = findViewById(R.id.btn_Reset)
        // Set an OnClickListener on the Reset button
        resetButton.setOnClickListener {
            val previousValue = counterValue
            counterValue = 0
            counterTextView.text = counterValue.toString()
            val message = "Reset: $previousValue -> $counterValue"
            showToast(message)
        }

    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
