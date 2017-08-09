package com.example.administrator.superdemo.di.component;

import android.app.Application;

import com.example.administrator.superdemo.data.http.ApiService;
import com.example.administrator.superdemo.di.module.AppModule;
import com.example.administrator.superdemo.di.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, HttpModule.class})
public interface AppComponent {

    public ApiService getApiService();

    public Application getApplication();

}
