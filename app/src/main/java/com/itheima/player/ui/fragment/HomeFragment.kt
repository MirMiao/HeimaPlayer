package com.itheima.player.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.itheima.player.R
import com.itheima.player.adapter.HomeAdapter
import com.itheima.player.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*
import okhttp3.*
import java.io.IOException

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

    override fun initData() {
        //初始化数据
        lodaDatas()
    }

    private fun lodaDatas() {
        val client=OkHttpClient()
        val request = Request.Builder()
           //.addHeader("page", "1")
          //  .addHeader("count", "10")
            .url("http://mobile.bwstudent.com/movieApi/movie/v2/findReleaseMovieList?page=1&count=20")
            .get()
            .build()
         client.newCall(request).enqueue(object :Callback{
             override fun onFailure(call: Call, e: IOException) {
                 myToast("失败")
             }

             override fun onResponse(call: Call, response: Response) {
                 myToast("成功")
                 val string = response?.body?.string();
                  println(string)
             }

         })

    }
}