package com.itheima.player.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.itheima.player.R

/**
 * 时间 :2020/5/14  20:32
 * 作者 :苗恒
 * 功能 :
 */
class HomeItenView: RelativeLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    /**
     * 初始化方法
      */
    init{
          View.inflate(context, R.layout.item_home,this);
     }
}