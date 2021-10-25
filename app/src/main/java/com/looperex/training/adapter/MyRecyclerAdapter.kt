package com.looperex.training.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.looperex.training.MoviesCatalog
import com.looperex.training.R
import com.looperex.training.models.Movies
import java.util.ArrayList

class MyRecyclerAdapter(var moviesCatalog: MoviesCatalog, var moviesList: ArrayList<Movies>, var listener: ItemClickListener) :
    RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(moviesCatalog).inflate(R.layout.myindivitem,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        println("-----"+moviesList.get(position))
        holder.textView.setText(moviesList.get(position).title)

        if(moviesList.get(position).isLiked) {
            holder.heartImage.setImageResource(R.drawable.ic_baseline_favorite_24)
        }else{
            holder.heartImage.setImageResource(R.drawable.ic_baseline_favorite_border_24)
        }
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var textView = v.findViewById<TextView>(R.id.myTV)
        var heartImage = v.findViewById<ImageView>(R.id.myIV)

        init {
            heartImage.setOnClickListener {
                listener.heartClicked(adapterPosition)
            }
        }
    }


    interface ItemClickListener{
        fun heartClicked(adapterPosition: Int)
    }

}
