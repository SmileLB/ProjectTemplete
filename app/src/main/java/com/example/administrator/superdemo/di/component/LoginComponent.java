package com.example.administrator.superdemo.di.component;


import com.example.administrator.superdemo.di.FragmentScope;
import com.example.administrator.superdemo.di.module.LoginModule;
import com.example.administrator.superdemo.ui.activity.MainActivity;

import dagger.Component;


@FragmentScope
@Component(modules = LoginModule.class,dependencies = AppComponent.class)
public interface LoginComponent {

//    void inject(LoginActivity activty);
    void inject(MainActivity activty);
}
