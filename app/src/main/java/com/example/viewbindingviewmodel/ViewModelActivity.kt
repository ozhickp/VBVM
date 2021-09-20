package com.example.viewbindingviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.viewbindingviewmodel.databinding.ActivityViewModelBinding

class ViewModelActivity: AppCompatActivity(), LifecycleOwner {

    private lateinit var binding: ActivityViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewModel = ViewModelProvider(this).get(ViewModelExtend::class.java)
        
        binding.textNumber.text = viewModel.number.toString()

        binding.btnadd.setOnClickListener {
            viewModel.addNumber()
            binding.textNumber.text = viewModel.number.toString()
        }
    }
}