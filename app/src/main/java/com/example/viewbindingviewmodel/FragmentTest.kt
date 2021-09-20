package com.example.viewbindingviewmodel

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.viewbindingviewmodel.databinding.FragmentTestBinding

class FragmentTest : Fragment(R.layout.fragment_test) {

    private lateinit var binding: FragmentTestBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTestBinding.bind(view)
        binding.textHelloWorld
    }
}