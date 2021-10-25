package com.looperex.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.looperex.training.adapter.MyRecyclerAdapter
import com.looperex.training.models.Movies
import kotlinx.android.synthetic.main.activity_movies_catalog.*

class MoviesCatalog : AppCompatActivity(), MyRecyclerAdapter.ItemClickListener {
    private lateinit var myAdapter: MyRecyclerAdapter
    private var moviesList: ArrayList<Movies> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_catalog)
        initViews()
    }

    private fun initViews() {
        moviesList.add(Movies("Arjun Reddy",true))
        moviesList.add(Movies("Billa",false))
        moviesList.add(Movies("Cinderalla",true))
        moviesList.add(Movies("David",false))
        moviesList.add(Movies("Eshwaran",true))
        moviesList.add(Movies("Fakir",false))
        moviesList.add(Movies("Guna",true))

        myAdapter = MyRecyclerAdapter(this, moviesList, this)

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = myAdapter
        myRecyclerView.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))

    }

    override fun heartClicked(adapterPosition: Int) {
        if(moviesList.get(adapterPosition).isLiked){
            moviesList.get(adapterPosition).isLiked = false
        }else {
            moviesList.get(adapterPosition).isLiked = true
        }
        myAdapter.notifyDataSetChanged()
    }
}