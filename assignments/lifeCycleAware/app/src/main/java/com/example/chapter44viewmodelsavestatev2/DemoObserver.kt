package com.example.chapter44viewmodelsavestatev2

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.chapter44viewmodelsavestatev2.MainViewModel.Companion.addLifecycle

class DemoObserver: DefaultLifecycleObserver {

    private val name = "DemoObserver"

    override fun onCreate(owner: LifecycleOwner) {
        addLifecycle("onCreate", "")
        Log.i(name, "onCreate")
    }
    override fun onResume(owner: LifecycleOwner) {
        addLifecycle("onResume", "**********\n")
        Log.i(name, "onResume")
    }
    override fun onPause(owner: LifecycleOwner) {
        addLifecycle("onPause", "**********\n")
        Log.i(name, "onPause")
    }
    override fun onStart(owner: LifecycleOwner) {
        addLifecycle("onStart","")
        Log.i(name, "onStart")
    }
    override fun onStop(owner: LifecycleOwner) {
        addLifecycle("onStop", "")
        Log.i(name, "onStop")
    }
    override fun onDestroy(owner: LifecycleOwner) {
        addLifecycle("onDestroy","**********\n")
        Log.i(name, "onDestroy")
    }
}