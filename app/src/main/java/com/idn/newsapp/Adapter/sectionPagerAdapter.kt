package com.idn.newsapp.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.idn.newsapp.Ui.AboutAlQuran
import com.idn.newsapp.Ui.aljazera
import com.idn.newsapp.Ui.warning
import common

class sectionPagerAdapter (fa:FragmentActivity): FragmentStateAdapter(fa){

    override fun getItemCount()= 4


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> common()
            1-> AboutAlQuran()
            2-> aljazera()
            3-> warning()
            else -> aljazera()
        }

    }
}