package jp.sugawara.shun.pagerviewpractice


import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class TabsPagerAdapter(fm: FragmentManager,tabsFragments : MutableList<Class<out Fragment>>):FragmentPagerAdapter(fm) {

    val tabsFragments:MutableList<Class<out Fragment>> = tabsFragments

    override fun getItem(position: Int): Fragment {
        return tabsFragments[position].newInstance()
    }

    override fun getCount(): Int {
        return tabsFragments.size
    }
}