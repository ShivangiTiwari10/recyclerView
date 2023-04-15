package com.example.recyclerview.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.News

class NewsAdapter(private val newsArrayList: ArrayList<News>, private var context: Activity) :
    RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    private lateinit var myListener: onItemClickListner

    interface onItemClickListner {

        fun onItemClicking(position: Int)
    }

    fun setItemClickListener(listener: onItemClickListner) {

        myListener = listener
    }

    //  ***  if layoutManager fails to find suitable view for each item it calls onCreateViewHolder to create view
//       by the help of viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.items_for_newrecycler, parent, false)
        return NewsViewHolder(view,myListener)
    }

    //         populate items with data
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

        val currentItem = newsArrayList[position]
        holder.textTittle.text = currentItem.title
        holder.profile.setImageResource(currentItem.image)


    }

    //      getItemCount method wants- no. of items
//     or how many items are present in your array
    override fun getItemCount(): Int {
        return newsArrayList.size
    }


    //    it holds the View so views are not created everyTime, so memory can be saved
    class NewsViewHolder(itemView: View, listener: onItemClickListner) :
        RecyclerView.ViewHolder(itemView) {

        val textTittle: TextView = itemView.findViewById(R.id.textTitle)

        //        val texDiscribe: TextView = itemView.findViewById(R.id.textDiscribe)
        val profile: ImageView = itemView.findViewById(R.id.profile_image)

        init {
            itemView.setOnClickListener {
                listener.onItemClicking(absoluteAdapterPosition)

            }

        }
    }
}

