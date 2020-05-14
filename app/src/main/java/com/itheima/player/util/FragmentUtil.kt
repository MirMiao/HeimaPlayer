package com.itheima.player.util

import com.itheima.player.R
import com.itheima.player.base.BaseFragment
import com.itheima.player.ui.fragment.HomeFragment
import com.itheima.player.ui.fragment.MvFragment
import com.itheima.player.ui.fragment.VBangFragment
import com.itheima.player.ui.fragment.YueDanFragment

/**
 * 时间 :2020/5/14  17:59
 * 作者 :苗恒
 * 功能 :  管理fragment的util类
 */
class FragmentUtil private constructor(){ //私有化构造方法
    val homeFragment by lazy { HomeFragment() }
    val mvFragment by lazy { MvFragment() }
    val vBangFragment by lazy { VBangFragment() }
    val yueDanFragment by lazy { YueDanFragment() }
    companion object{
        val fragmentUtil by lazy { FragmentUtil() }
    }

    /**
     * 根据tabId获取对应的fragment
     */
    fun getFragment(tabId:Int):BaseFragment?{
          when(tabId){
              R.id.tab_home-> return homeFragment
              R.id.tab_mv-> return mvFragment
              R.id.tab_vbang-> return vBangFragment
              R.id.tab_yuedan-> return yueDanFragment
          }
         return null
    }
}