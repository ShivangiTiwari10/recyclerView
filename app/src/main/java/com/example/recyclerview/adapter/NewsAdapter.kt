package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.News

class NewsAdapter(private val news: ArrayList<News>) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.items_for_newrecycler, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.textTittle.text = news[position].title
        holder.texDiscribe.text = news[position].description
        holder.profile.setImageResource(news[position].image)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textTittle: TextView = itemView.findViewById(R.id.textTitle)
        val texDiscribe: TextView = itemView.findViewById(R.id.textDiscribe)
        val profile: ImageView = itemView.findViewById(R.id.profile_image)
    }
}

