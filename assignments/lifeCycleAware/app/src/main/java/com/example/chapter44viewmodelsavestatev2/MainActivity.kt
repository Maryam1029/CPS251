package com.example.chapter44viewmodelsavestatev2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import com.example.chapter44viewmodelsavestatev2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var demoOwner: DemoOwner
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.application?.let {
            val factory = SavedStateViewModelFactory(it, this)

            viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]
        }


        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding = ActivityMainBinding.inflate(layoutInflater)

        val resultObserver = Observer<String>{
            result -> binding.resultText.text = result
        }

        viewModel.getResult().observe(this,resultObserver)

        setContentView(binding.root)
        demoOwner = DemoOwner(this.lifecycle)
        demoOwner.startOwner()
        demoOwner.stopOwner()

    }

}