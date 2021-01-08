package com.barasan.myhilt

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel

class MainViewModel @ViewModelInject constructor(
    private val singletonClass: SingletonClass): ViewModel() {
    fun getHashcode(): String {
        return singletonClass.hashCode().toString()
    }
}

