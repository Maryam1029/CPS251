package com.example.chapter43DataBindingBasic

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData


class MainViewModel : ViewModel() {
    var dollarValue: MutableLiveData<String> = MutableLiveData()
    var result: MutableLiveData<String> = MutableLiveData("")

    fun convertValue() {
        dollarValue.let {
            if (!it.value.equals("")) {
                result.value = it.value?.toString() + "\n" + result.value
            } else {
                result.value = ""
            }
        }
    }

}