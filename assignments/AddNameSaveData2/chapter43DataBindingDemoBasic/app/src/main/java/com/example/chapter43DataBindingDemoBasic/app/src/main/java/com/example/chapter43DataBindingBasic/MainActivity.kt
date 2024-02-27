package com.example.chapter43DataBindingBasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.databinding.DataBindingUtil
import com.example.chapter43DataBindingBasic.databinding.ActivityMainBinding
import com.example.chapter43DataBindingBasic.BR.myViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        binding.lifecycleOwner = this
        binding.setVariable(myViewModel, viewModel)

        setContentView(binding.root)
    }



}