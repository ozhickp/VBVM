package com.example.viewbindingviewmodel

import androidx.lifecycle.ViewModel

class ViewModelExtend: ViewModel() {

    var number = 0
    fun addNumber() {
        number++
    }

}