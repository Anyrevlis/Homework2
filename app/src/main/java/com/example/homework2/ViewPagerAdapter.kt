package com.example.homework2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int) : Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            else -> Fragment1()
        }
    }
}


