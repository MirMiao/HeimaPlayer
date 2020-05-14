package com.itheima.player.util

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import com.itheima.player.R

/**
 * 时间 :2020/5/14  11:02
 * 作者 :苗恒
 * 功能 :  所有界面的toobal管理类
 */
interface ToolBarManager {
    val toolbar: Toolbar
    /**
     * 初始化主界面中的toolBar
     */

    fun initMainToolBar(){
        toolbar.setTitle("黑马影音")
        toolbar.inflateMenu(R.menu.main)

    }
}