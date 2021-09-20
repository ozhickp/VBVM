package com.example.viewbindingviewmodel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import android.widget.Button
import androidx.lifecycle.ViewModel
import com.example.viewbindingviewmodel.databinding.ActivityMainBinding
import com.example.viewbindingviewmodel.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {

    private lateinit var btnVb: Button
    private lateinit var btnVm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnVb = findViewById(R.id.btnVb)
        btnVm = findViewById(R.id.btnVm)

        btnVb.setOnClickListener {
            val intent = Intent(this, ViewBindingActivity::class.java)
            startActivity(intent)
        }

        btnVm.setOnClickListener {
            val intent = Intent(this, ViewModelActivity::class.java)
            startActivity(intent)
        }

    }
}