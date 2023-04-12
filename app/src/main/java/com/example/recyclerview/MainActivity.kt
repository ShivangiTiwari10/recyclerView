package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val songs = listOf(
//            "oh mere",
//            "ye Jawani",
//            "yo Yo",
//            "Dj",
//            "yeee",
//            "Kesariya",
//            "Brahmastra",
//            " Apna Bana ",
//            "  Heer Ranjha",
//            "Rajat Nagpal",
//            "Baarish Mein Tum",
//            "  Bas Tujhse Pyaar Ho",
//            "  Thumkeshwari"
//
//        )

        val songsObjects = mutableListOf<Song>()
        songsObjects.add(Song("Hello","this is discription"))
        songsObjects.add(Song("Abcd","this is JioSavan"))
        songsObjects.add(Song("1235","this is LocalBeats"))
        songsObjects.add(Song("12.36","this is radio"))
        songsObjects.add(Song("Lodon","this is sonuNigam"))
        songsObjects.add(Song("Mumbai","this is imraan"))
        songsObjects.add(Song("Laxmi","this is Salman"))
        songsObjects.add(Song("Key","this is shreya"))

        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)
    }


}