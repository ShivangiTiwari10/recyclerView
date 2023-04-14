package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
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
        songsObjects.add(Song("Hello", "this is discription"))
        songsObjects.add(Song("Abcd", "this is JioSavan"))
        songsObjects.add(Song("1235", "this is LocalBeats"))
        songsObjects.add(Song("12.36", "this is radio"))
        songsObjects.add(Song("Lodon", "this is sonuNigam"))
        songsObjects.add(Song("Mumbai", "this is imraan"))
        songsObjects.add(Song("Laxmi", "this is Salman"))
        songsObjects.add(Song("Key", "this is shreya"))

        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)


    }


}