package com.itheima.player.util

import android.content.Intent
import android.os.Build
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import com.itheima.player.R
import com.itheima.player.ui.activity.SettingActivity
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

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
        //kotlin和java的特性
        //如果java接口中只有一个未实现的方法 可以省略接口对象，直接用{}表示未实现的方法
        toolbar.setOnMenuItemClickListener{
            toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
              true
        }
       /* toolbar.setOnMenuItemClickListener(object:Toolbar.OnMenuItemClickListener{
            override fun onMenuItemClick(item: MenuItem?): Boolean {
                when(item?.itemId){
                    R.id.setting->{
                         toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
                    }
                }
                return true
            }
        })*/

    }
    fun initSettingToolbar(){
        toolbar.setTitle("设置界面")
    }
}