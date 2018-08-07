package jp.sugawara.shun.pagerviewpractice

import android.graphics.Color
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.view.ViewPager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import android.support.design.widget.TabLayout


class MainActivity : AppCompatActivity() {


    private var mTabsPagerAdapter : TabsPagerAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val tabsFragments = arrayListOf(
                Tab1Fragment::class.java,
                Tab2Fragment::class.java,
                Tab3Fragment::class.java
        )

        mTabsPagerAdapter = TabsPagerAdapter(supportFragmentManager,tabsFragments)
        container.adapter = mTabsPagerAdapter

        container.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> changeColor(Color.RED)
                    1 -> changeColor(Color.BLUE)
                    2 -> changeColor(Color.DKGRAY)
                }
            }
        })

        tabs.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(container))

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
    }

    private fun changeColor(color : Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.setStatusBarColor(color)
        }
        tabs.setBackgroundColor(color)
        toolbar.setBackgroundColor(color)
    }


}
