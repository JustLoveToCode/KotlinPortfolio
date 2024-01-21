package com.mastercoding.ldvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    // Read Only the counter Variable:
    private var counter = MutableLiveData<Int>()
    val countData: LiveData<Int>
    // Use the get method for the counter:
    get() = counter

    // Let the initial count be equal to 0:
    init{
        counter.value = 0
    }

    // Update the counter using the updateCounter() Function:
    fun updateCounter(){
        counter.value=(counter.value)?.plus(1)
    }
}