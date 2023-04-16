package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.NewsAdapter
import com.example.recyclerview.databinding.ActivityNewRecyclerBinding
import com.example.recyclerview.model.News

class NewRecycler : AppCompatActivity() {

    private lateinit var binding: ActivityNewRecyclerBinding
    private lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val title = arrayOf("Politics", "science", "environment", "Astrology", "Technology")

        val image = intArrayOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image4,
            R.drawable.floura,
            R.drawable.environment
        )
        val discription = arrayOf(
          getString(R.string.discriptions),
          getString(R.string.discriptions),
          getString(R.string.discriptions),
          getString(R.string.discriptions),
          getString(R.string.discriptions),
        )


//        to set hav bhav of items inside recyclerView vertically scrolling,horizontally uniform grid
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

//        initialized
        newsArrayList =arrayListOf()


        for (eachIndexes in title.indices) {

            val news = News(title[eachIndexes], image[eachIndexes],discription[eachIndexes])
            newsArrayList.add(news)

        }
        val newsAdapter = NewsAdapter(newsArrayList,this)
        binding.recyclerView.adapter = newsAdapter

        newsAdapter.setOnItemClickListener(object : NewsAdapter.onItemClickListner{
            override fun onItemClicking(position: Int) {
                val intent =Intent(this@NewRecycler,NewsDetailActivity::class.java)

                intent.putExtra("title",newsArrayList[position].title)
                intent.putExtra("description",newsArrayList[position].description)
                intent.putExtra("image",newsArrayList[position].image)
                startActivity(intent)

            }

        })


//        To set recyclerView  horizontally
//        binding.recyclerView.layoutManager =
//            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


    }

}