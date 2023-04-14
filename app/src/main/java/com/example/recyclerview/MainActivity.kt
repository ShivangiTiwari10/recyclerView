package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.Song
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNewRecycler.setOnClickListener {

            val intent = Intent(this,NewRecycler::class.java)
            startActivity(intent)
            Log.d("Exeption", "$intent")
        }

        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Hello", "this is discription",R.color.teal_200))
        songsObjects.add(Song("Abcd", "this is JioSavan",R.color.purple_200))
        songsObjects.add(Song("1235", "this is LocalBeats",R.color.purple_700))
        songsObjects.add(Song("12.36", "this is radio",R.color.white))
        songsObjects.add(Song("Lodon", "this is sonuNigam",R.color.purple_200))
        songsObjects.add(Song("Mumbai", "this is imraan",R.color.teal_700))
        songsObjects.add(Song("Laxmi", "this is Salman",R.color.white))
        songsObjects.add(Song("Key", "this is shreya",R.color.purple_200))

        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)


    }


}