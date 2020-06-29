package com.youngwu.kotlin.myapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.youngwu.kotlin.myapplication.R
import com.youngwu.kotlin.myapplication.application.MyApp
import com.youngwu.kotlin.myapplication.util.DensityUtil
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val info = StringBuilder()
        info.append("dip2px:50dip=${DensityUtil.dip2px(MyApp.getContext(), 50f)}px")
        info.append("\n")
        info.append("px2dip:50px=${DensityUtil.px2dip(MyApp.getContext(), 50f)}dip")
        info.append("\n")
        info.append("px2sp:50px=${DensityUtil.px2sp(MyApp.getContext(), 50f)}sp")
        info.append("\n")
        info.append("sp2px:50sp=${DensityUtil.sp2px(MyApp.getContext(), 50f)}px")
        info.append("\n")
        info.append("getDisplayHeight=${DensityUtil.getDisplayHeight(MyApp.getContext())}px")
        info.append("\n")
        info.append("getDisplayWidth=${DensityUtil.getDisplayWidth(MyApp.getContext())}px")
        tv_info.text = info.toString()
    }
}