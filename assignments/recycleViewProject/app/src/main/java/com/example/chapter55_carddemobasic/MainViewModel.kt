package com.example.chapter55_carddemobasic

import androidx.lifecycle.ViewModel
import com.example.chapter55_carddemobasic.Data.Companion.details
import com.example.chapter55_carddemobasic.Data.Companion.images
import com.example.chapter55_carddemobasic.Data.Companion.titles

class MainViewModel : ViewModel() {

    fun randomize() {
        var i = titles.indices.random()
        for (x in titles.indices){
            val ttl = titles[x]
            titles[x] = titles[i]
            titles[i] = ttl

            i = titles.indices.random()
            val description = details[x]
            details[x] = details[i]
            details[i] = description

            i = titles.indices.random()
            val image = images[x]
            images[x] = images[i]
            images[i] = image
        }
    }
}

   // }
