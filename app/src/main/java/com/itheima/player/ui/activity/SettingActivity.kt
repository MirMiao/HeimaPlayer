package com.itheima.player.ui.activity

import android.preference.PreferenceManager
import androidx.appcompat.widget.Toolbar
import com.itheima.player.R
import com.itheima.player.base.BaseActivity
import com.itheima.player.util.ToolBarManager
import org.jetbrains.anko.find

/**
 * 时间 :2020/5/14  17:23
 * 作者 :苗恒
 * 功能 :
 */
class SettingActivity:BaseActivity(),ToolBarManager{
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolBar) }
    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolbar()
        //获取通知有没有选中
      var sp=  PreferenceManager.getDefaultSharedPreferences(this)
        val push = sp.getBoolean("push", false);
        println("push=$push")
    }
}