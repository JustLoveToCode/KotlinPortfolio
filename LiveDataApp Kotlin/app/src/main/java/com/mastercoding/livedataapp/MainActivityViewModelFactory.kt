package com.mastercoding.livedataapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// ViewModel: It is used to store and manage the UI related Data
// ViewModelProvider.Factory: An Interface that define the Single Method called create:
// The purpose of this interface is to create your own factory for creating the ViewModels
class MainActivityViewModelFactory(private val startingNum:Int): ViewModelProvider.Factory {
    override fun <T: ViewModel> create(modelClass: Class<T>):T{
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(startingNum) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}