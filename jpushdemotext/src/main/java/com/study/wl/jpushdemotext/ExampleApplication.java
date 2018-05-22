package com.study.wl.jpushdemotext;

import android.app.Application;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by ${WU} on 2018/5/22.
 */

public class ExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        JPushInterface.setDebugMode(true);
        JPushInterface.init(this);
    }
}
