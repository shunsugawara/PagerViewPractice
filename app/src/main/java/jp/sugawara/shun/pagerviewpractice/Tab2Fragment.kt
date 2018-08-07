package jp.sugawara.shun.pagerviewpractice

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Tab2Fragment : Fragment() {
    companion object {
        fun newInstance(): Tab2Fragment {
            val fragment = Tab2Fragment()
            return fragment
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return super.onCreateView(inflater, container, savedInstanceState)
        return inflater!!.inflate(R.layout.fragment_tab1, container, false)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }
    override fun onDetach() {
        super.onDetach()
    }

}