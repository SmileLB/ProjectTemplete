package com.example.administrator.superdemo.data;

import com.example.administrator.superdemo.bean.BaseBean;
import com.example.administrator.superdemo.bean.LoginBean;
import com.example.administrator.superdemo.data.http.ApiService;
import com.example.administrator.superdemo.presenter.contract.LoginContract;

import io.reactivex.Observable;

/**
 * Created by LiBing
 * on 2017/8/9 0009
 * describe:
 */

public class LoginModel implements LoginContract.ILoginModel{

    private ApiService mApiService;

    public LoginModel(ApiService apiService) {
        mApiService = apiService;
    }

    @Override
    public Observable<BaseBean<LoginBean>> login(String phone, String pwd) {
        /*LoginRequestBean param = new LoginRequestBean();
        param.setEmail(phone);
        param.setPassword(pwd);

        return mApiService.login(param);*/
        return null;
    }
}
