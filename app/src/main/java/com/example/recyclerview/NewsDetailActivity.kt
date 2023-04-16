package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.recyclerview.databinding.ActivityNewsDetailBinding
import kotlinx.android.synthetic.main.activity_news_detail.*

class NewsDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNewsDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNewsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titles.text = intent.getStringExtra("title")
        binding.diss.text = intent.getStringExtra("description")
        Log.d("Discription","${diss.text}")
        binding.shapeableImageView.setImageResource(intent.getIntExtra("image", R.drawable.floura))

    }
}