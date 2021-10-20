package com.looperex.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.looperex.training.adapter.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_my_fragment.*

class MyFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_fragment)

        initViews()
    }

    private fun initViews() {
        myTab.addTab(myTab.newTab().setText("CHATS"))
        myTab.addTab(myTab.newTab().setText("CALLS"))
        myTab.addTab(myTab.newTab().setText("CONTACTS"))

        var adapter = MyViewPagerAdapter(this, supportFragmentManager, myTab.tabCount)
        myViewPager.adapter = adapter
    }
}