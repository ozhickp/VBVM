package com.example.viewbindingviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewbindingviewmodel.databinding.ActivityViewBindingBinding

class ViewBindingActivity: AppCompatActivity() {

    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding!!.tvBinding
    }
}