package com.mastercoding.viewpagerlayout.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mastercoding.viewpagerlayout.MainActivity
import com.mastercoding.viewpagerlayout.fragments.FragmentOne
import com.mastercoding.viewpagerlayout.fragments.FragmentThree
import com.mastercoding.viewpagerlayout.fragments.FragmentTwo

class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {
    private val Fragments_Size = 3
    override fun getItemCount(): Int {
       return this.Fragments_Size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->{
                return FragmentOne()
            }
            1->{
                return FragmentTwo()
            }
            2->{
                return FragmentThree()
            }
        }
        return FragmentOne()
    }


}