package com.itheima.player.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

import com.itheima.player.R
import com.itheima.player.base.BaseActivity
import com.itheima.player.util.FragmentUtil
import com.itheima.player.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager{
    //惰性加载
    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolBar) }
    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
      //设置tab切换的监听
        bottomBar.setOnTabSelectListener {
           // it代表参数id
            val beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.container, FragmentUtil.fragmentUtil.getFragment(it)!!,it.toString())
            beginTransaction.commit()
        }
    }
}
