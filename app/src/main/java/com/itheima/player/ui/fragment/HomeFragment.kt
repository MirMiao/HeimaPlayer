package com.itheima.player.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.itheima.player.R
import com.itheima.player.adapter.HomeAdapter
import com.itheima.player.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * 时间 :2020/5/14  17:56
 * 作者 :苗恒
 * 功能 :
 */
class HomeFragment :BaseFragment() {
    override fun initView(): View? {
        return View.inflate(context, R.layout.fragment_home,null);
    }

    override fun initListener() {
        //初始化recyclerview
        recyclerView.layoutManager=LinearLayoutManager(context)
          //适配
        val  adapter=HomeAdapter()
        recyclerView.adapter=adapter
    }
}