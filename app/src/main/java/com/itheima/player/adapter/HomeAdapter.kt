package com.itheima.player.adapter

import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.itheima.player.widget.HomeItenView

/**
 * 时间 :2020/5/14  20:51
 * 作者 :苗恒
 * 功能 :
 */
class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeHolder>() {
  class HomeHolder(itemView:View):RecyclerView.ViewHolder(itemView){

  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
     return HomeHolder(HomeItenView(parent?.context))
    }

    override fun getItemCount(): Int {
        return 20
    }

    override fun onBindViewHolder(holder: HomeHolder, position: Int) {
    }
}