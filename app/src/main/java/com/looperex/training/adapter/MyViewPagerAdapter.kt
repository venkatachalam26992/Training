package com.looperex.training.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.looperex.training.CallsFragment
import com.looperex.training.MyFragmentActivity
import com.looperex.training.fragment.ChatsFragment
import com.looperex.training.fragment.ContactFragment

class MyViewPagerAdapter(var myFragment: MyFragmentActivity, supportFragmentManager: FragmentManager, var tabCount: Int) : FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return tabCount
    }

    /*override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Calls"
            }
            1 -> {
                return "Chats"
            }
            2 -> {
                return "Contacts"
            }
            else -> {
                return "Calls"
            }
        }
    }*/

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return ChatsFragment()
            }
            1 -> {
                return CallsFragment()
            }
            2 -> {
                return ContactFragment()
            }
            else ->{
                return CallsFragment()
            }
        }
    }

}
