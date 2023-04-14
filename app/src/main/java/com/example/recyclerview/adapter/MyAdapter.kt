package com.example.recyclerview.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Song

class MyAdapter(val songs: List<Song>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textTittle.text = songs[position].title
        holder.textDisciption.text = songs[position].discription
        holder.container.setBackgroundColor(songs[position].background)

//        var color = "#00FF00"
//        if ((position % 2) == 0) {
//            color = "#EEEE"
//        }
//
//
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val textTittle = itemView.findViewById<TextView>(R.id.textTittle)
        val textDisciption = itemView.findViewById<TextView>(R.id.textDiscription)
        var container: LinearLayout = itemView.findViewById(R.id.container)

    }


}


