package com.example.administrator.superdemo.di.module;


import com.example.administrator.superdemo.data.LoginModel;
import com.example.administrator.superdemo.data.http.ApiService;
import com.example.administrator.superdemo.presenter.contract.LoginContract;

import dagger.Module;
import dagger.Provides;


@Module
public class LoginModule {

    private LoginContract.ILoginView mView;

    public LoginModule(LoginContract.ILoginView view){
        this.mView = view;
    }

    @Provides
    public LoginContract.ILoginView ProvidesLoginView(){
        return mView;
    }

    @Provides
    public LoginContract.ILoginModel ProvidesLoginModel(ApiService service){
        return new LoginModel(service);
    }

}
