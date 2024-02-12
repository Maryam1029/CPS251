package com.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tipcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    fun calculateTip(view: View) {
        if (binding.dollarText.text.isNotEmpty()) {
            val dollarValue = binding.dollarText.text.toString().toFloat()
            val ten = dollarValue * 0.1f + dollarValue
            val fifteen = dollarValue * .15f + dollarValue
            val twenty = dollarValue * .2f + dollarValue
            val total = "The tips are as follows:\n\n10% = $ten\n15% = $fifteen\n20% = $twenty"

            binding.textView.text = total.toString()
        } else {
            binding.textView.text = getString(R.string.noEntry)
        }
    }
}