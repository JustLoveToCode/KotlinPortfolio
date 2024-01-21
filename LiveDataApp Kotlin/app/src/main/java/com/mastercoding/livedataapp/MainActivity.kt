package com.mastercoding.livedataapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mastercoding.livedataapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    lateinit var viewModel:MainActivityViewModel
    lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Starting your Code Here:
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModelFactory = MainActivityViewModelFactory(200)
        // Connecting the viewModel with the viewModelFactory:
        viewModel = ViewModelProvider(this,viewModelFactory).get(
            MainActivityViewModel::class.java
        )
        // Observer: Observing for any Data Changes
        viewModel.totalSum.observe(
            this,
            Observer{
                binding.resultTXT.text = it.toString()
            }
        )

        binding.btn.setOnClickListener {
            viewModel.sumUp(binding.editText.text.toString().toInt())
        }




    }
}
