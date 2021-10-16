package com.looperex.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity()  {

    //Fruits List - Array List variable
    var fruits: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        //Adding data into ListView
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

        //Creating an Array Adapter object and storing in the variable named adapterObj
        var adapterObj = ArrayAdapter(this,R.layout.mylistitem,fruits)

        //Setting an Array Adapter for ListView named myListView
        myListView.adapter = adapterObj

        //List view Item Click Listener and showing Toast
        myListView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, fruits.get(position), Toast.LENGTH_LONG).show()
        }


    }
}