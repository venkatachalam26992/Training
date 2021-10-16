package com.looperex.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.looperex.training.adapter.MyRecyclerAdapter
import kotlinx.android.synthetic.main.activity_movies_catalog.*

class MoviesCatalog : AppCompatActivity() {
    private var moviesList: ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies_catalog)
        initViews()
    }

    private fun initViews() {
        moviesList.add("Arjun Reddy")
        moviesList.add("Billa")
        moviesList.add("Cinderalla")
        moviesList.add("David")
        moviesList.add("Eshwaran")
        moviesList.add("Fakir")
        moviesList.add("Guna")

        var myAdapter = MyRecyclerAdapter(this, moviesList)

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        myRecyclerView.adapter = myAdapter
        myRecyclerView.addItemDecoration(DividerItemDecoration(this,LinearLayoutManager.VERTICAL))

    }
}