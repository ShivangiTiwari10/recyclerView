package com.example.recyclerview.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.NewsDetailActivity
import com.example.recyclerview.R
import com.example.recyclerview.model.News

class NewsAdapter( private val news: ArrayList<News>,private var context: Activity) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

//       if layoutManager fails to find suitable view for each item it calls onCreateViewHolder to create view
//       by the help of viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.items_for_newrecycler, parent, false)
        return NewsViewHolder(view)
    }

    //         populate items with data
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.textTittle.text = news[position].title
        holder.texDiscribe.text = news[position].description
        holder.profile.setImageResource(news[position].image)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, NewsDetailActivity::class.java)
            intent.putExtra("title",news[position].title)
            intent.putExtra("discrip",news[position].description)
          context.startActivity(intent)

        }
    }

    //      getItemCount method wants- no. of items
//     or how many items are present in your array
    override fun getItemCount(): Int {
        return news.size
    }


    //    it holds the View so views are not created everyTime, so memory can be saved
    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textTittle: TextView = itemView.findViewById(R.id.textTitle)
        val texDiscribe: TextView = itemView.findViewById(R.id.textDiscribe)
        val profile: ImageView = itemView.findViewById(R.id.profile_image)
    }
}

