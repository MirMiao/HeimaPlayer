package com.itheima.player.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * 时间 :2020/5/14  9:45
 * 作者 :苗恒
 * 功能 :
 */
abstract class BaseFragment:Fragment(),AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init();
    }

    /**
     * 初始化
     */
  open  protected fun init() {
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return initView()
    }

    /**
     * 获取布局的view
     */
    abstract fun initView(): View?

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    /**
     * 数据初始化
     */
  open  protected fun initData() {
    }

    /**
     * adapter listener
     */
   open protected fun initListener() {
    }
   open fun myToast(msg:String){

    }
}