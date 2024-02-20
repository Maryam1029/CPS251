package com.example.chapter40viewmodeldemo_basic

import androidx.lifecycle.ViewModel
class MainViewModel : ViewModel() {
    private var dollarText = ""
    private var result: String = ""
    fun setAmount(value: String) {
        this.dollarText = value
        result = value + "\n" + result
    }

    fun getResult(): String {
        return result
    }
}