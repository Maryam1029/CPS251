package com.example.chapter44viewmodelsavestatev2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainViewModel : ViewModel() {
    companion object{
        private var sec: MutableLiveData<String> = MutableLiveData("")

        fun addLifecycle(name: String, separator: String){
            val date = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss.SSS"))
            sec.value = sec.value + "$name was fired on " + date + "\n" +separator
        }
    }

    fun getResult(): MutableLiveData<String>{
        //sec.value = sec.value + "***"
        return sec
    }
}

