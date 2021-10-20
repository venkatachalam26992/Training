package com.looperex.training.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.looperex.training.CallsFragment
import com.looperex.training.MyFragment

class MyViewPagerAdapter(var myFragment: MyFragment, supportFragmentManager: FragmentManager, var tabCount: Int) : FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return tabCount
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return CallsFragment()
            }
            1 -> {
                return CallsFragment()
            }
            2 -> {
                return CallsFragment()
            }
            else -> {
                return CallsFragment()
            }
        }
    }

}
