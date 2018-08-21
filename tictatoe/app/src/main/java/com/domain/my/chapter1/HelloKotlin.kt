package com.domain.my.chapter1

import android.view.View
import android.widget.Toast


class HelloKotlin(private var message: String) {



    constructor(): this("Hello Kotlin!")

    fun displayMessage(view: View){
        Toast.makeText(null, message, Toast.LENGTH_LONG)
    }


}