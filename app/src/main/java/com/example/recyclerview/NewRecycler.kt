package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityNewRecyclerBinding

class NewRecycler : AppCompatActivity() {

    private  lateinit var  binding: ActivityNewRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}