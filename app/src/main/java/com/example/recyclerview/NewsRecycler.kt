package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityNewsRecyclerBinding

class NewsRecycler : AppCompatActivity() {
    private lateinit var binding: ActivityNewsRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNewsRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}