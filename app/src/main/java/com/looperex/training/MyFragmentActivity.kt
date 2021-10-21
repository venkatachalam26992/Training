package com.looperex.training

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.get
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.looperex.training.adapter.MyRecyclerAdapter
import com.looperex.training.adapter.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_my_fragment.*

class MyFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_fragment)

        initViews()
    }

    private fun initViews() {
        myTab.addTab(myTab.newTab().setText("Chats"))
        myTab.addTab(myTab.newTab().setText("Calls"))
        myTab.addTab(myTab.newTab().setText("Contacts"))

        val adapter = MyViewPagerAdapter(this, supportFragmentManager, 3)
        myViewPager.setAdapter(adapter)

        //myTab.setupWithViewPager(myViewPager)
        myTab.setupWithViewPager(myViewPager,true)

        /*myTab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                myViewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })

        myViewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                myTab.setScrollPosition(position, positionOffset,true,true)
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })*/

    }
}