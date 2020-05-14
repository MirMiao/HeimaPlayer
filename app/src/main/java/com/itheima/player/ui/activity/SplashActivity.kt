package com.itheima.player.ui.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.itheima.player.R
import com.itheima.player.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

/**
 * 时间 :2020/5/14  9:50
 * 作者 :苗恒
 * 功能 :
 */
class SplashActivity :BaseActivity(), ViewPropertyAnimatorListener {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        //缩小动画
        ViewCompat.animate(imageView).scaleX(1.0f).scaleY(1.0f)
            .setListener(this)
            .setDuration(2000)
    }

    override fun onAnimationEnd(view: View?) {
        //进入到主界面
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {
    }

    override fun onAnimationStart(view: View?) {
    }
}