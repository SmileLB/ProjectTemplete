package com.example.administrator.superdemo.presenter.contract;


import com.example.administrator.superdemo.bean.BaseBean;
import com.example.administrator.superdemo.bean.LoginBean;
import com.example.administrator.superdemo.ui.BaseView;

import io.reactivex.Observable;

public interface LoginContract {

    interface ILoginView extends BaseView {
        void checkPhoneError();
        void checkPhoneSuccess();
        void loginSuccess(LoginBean bean);

    }

    interface ILoginModel{
       Observable<BaseBean<LoginBean>> login(String phone, String pwd);
    }
}
