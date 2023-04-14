package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.databinding.ActivityNewRecyclerBinding
import com.example.recyclerview.model.News

class NewRecycler : AppCompatActivity() {

    private lateinit var binding: ActivityNewRecyclerBinding
    private lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = arrayOf("Politics", "science", "environment", "Astrology", "Technology")
        val discription = arrayOf(
            "Authoritarians Having a Bad Time The Left Anchor hosts discuss recent",
            "TLMTI’s Stanley Browne Laboratory (SBL), where basic science research is conducted",
            "Plat a Tree and Save Earth - Sankalp Taru Foundation",
            "Astronomy Research. Climate Research. Planetary Research",
            "Cloud-based. SMS. Programas: Prehospital, Desastre, Emergencia Obstetrica."
        )

        val image = intArrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image4,
            R.drawable.floura,
            R.drawable.environment
        )
        newsArrayList = ArrayList()

        for (eachIndexes in title.indices) {

            val news = News(title[eachIndexes], discription[eachIndexes], image[eachIndexes])
            newsArrayList.add(news)
        }

    }
}