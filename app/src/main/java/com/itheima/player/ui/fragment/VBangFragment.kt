package com.itheima.player.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.itheima.player.base.BaseFragment

/**
 * 时间 :2020/5/14  17:56
 * 作者 :苗恒
 * 功能 :
 */
class VBangFragment :BaseFragment() {
    override fun initView(): View? {
        var tv=TextView(context)
        tv.gravity=Gravity.CENTER
        tv.setTextColor(Color.RED)
        tv.text=javaClass.simpleName
        return tv;
    }
}