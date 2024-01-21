package com.mastercoding.livedataapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingNum: Int) : ViewModel() {
    // Notify the Observers when the Data has Changed:
    private var total = MutableLiveData<Int>()

    // Use MutableLiveData for totalSum
    val totalSum:LiveData<Int>
    get() = total

    init{
        total.value = startingNum
    }

    fun sumUp(input:Int){
        total.value = (total.value)?.plus(input)
    }
}