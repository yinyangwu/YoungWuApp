package com.youngwu.kotlin.myapplication.application

import android.app.Application

/**
 * @author yinyangwu
 * @date 2020/6/29 11:43
 * description:
 */
class MyApp : Application() {

    companion object {
        lateinit var app: Application

        fun getContext(): Application {
            return app
        }
    }

    override fun onCreate() {
        super.onCreate()
        app = this
    }

}