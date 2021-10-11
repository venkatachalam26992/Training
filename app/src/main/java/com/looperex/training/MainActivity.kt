package com.looperex.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity()  {

    /*array
    *
    * Apple
    * Banana
    * Cherry
    * Orange
    * mango
    * watermelon
    * kiwi
    *
    * */

    var fruits: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        fruits.add("Apple")
        fruits.add("Banana")
        fruits.add("Cherry")
        fruits.add("Orange")
        fruits.add("Kiwi")
        fruits.add("Mango")
        fruits.add("12")
        fruits.add("Banana")
        fruits.add("Cherry")
        fruits.add("Orange")
        fruits.add("Kiwi")
        fruits.add("Mango")
        fruits.add("Apple")
        fruits.add("Banana")
        fruits.add("Cherry")
        fruits.add("Orange")
        fruits.add("Kiwi")
        fruits.add("Mango")

        myListView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,fruits)


    }
}