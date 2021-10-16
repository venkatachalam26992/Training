package com.looperex.training.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.looperex.training.MoviesCatalog
import com.looperex.training.R
import java.util.ArrayList

class MyRecyclerAdapter(var moviesCatalog: MoviesCatalog, var moviesList: ArrayList<String>) :
    RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(moviesCatalog).inflate(R.layout.myindivitem,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        println("-----"+moviesList.get(position))
        holder.textView.setText(moviesList.get(position))
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var textView = v.findViewById<TextView>(R.id.myTV)
    }

}
