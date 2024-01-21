package com.mastercoding.tablayoutapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mastercoding.tablayoutapp.fragments.BookFragment
import com.mastercoding.tablayoutapp.fragments.GameFragment
import com.mastercoding.tablayoutapp.fragments.MoviesFragment

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->return MoviesFragment()
            1->return BookFragment()
        }
        return GameFragment()
    }

}