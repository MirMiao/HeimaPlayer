package com.itheima.player.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * 时间 :2020/5/14  9:28
 * 作者 :苗恒
 * 功能 :
 */
 abstract class BaseActivity :AppCompatActivity(),AnkoLogger{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener();
        initData();
    }

    /**
     * 初始化数据
     */
   open protected fun initData() {
    }

    /**
     * adapter listener
     */
  open  protected fun initListener() {

    }

    abstract fun getLayoutId(): Int
  open  protected fun myToast(msg:String){
        runOnUiThread{ toast(msg)}
    }

    /**
     * 开启一个Activity并且finish
     */
    inline fun<reified T:BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }
}