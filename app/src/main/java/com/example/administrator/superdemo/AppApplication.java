package com.example.administrator.superdemo;

import android.app.Application;
import android.content.Context;

import com.example.administrator.superdemo.di.component.AppComponent;
import com.example.administrator.superdemo.di.component.DaggerAppComponent;
import com.example.administrator.superdemo.di.module.AppModule;
import com.example.administrator.superdemo.di.module.HttpModule;


public class AppApplication extends Application{

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent= DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .httpModule(new HttpModule())
                .build();
    }

    public static AppApplication get(Context context){
        return (AppApplication)context.getApplicationContext();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
