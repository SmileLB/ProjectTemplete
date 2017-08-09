package com.example.administrator.superdemo.di.module;

import android.app.Application;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    private Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    public Application providerApplication(){
        return mApplication;
    }

    @Provides
    @Singleton
    public Gson providerGson(){
        return new Gson();
    }
}
