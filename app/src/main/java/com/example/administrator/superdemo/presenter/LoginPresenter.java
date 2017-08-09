package com.example.administrator.superdemo.presenter;


import com.example.administrator.superdemo.presenter.contract.LoginContract;

import javax.inject.Inject;



public class LoginPresenter extends BasePresenter<LoginContract.ILoginModel, LoginContract.ILoginView> {

    @Inject
    public LoginPresenter(LoginContract.ILoginModel model, LoginContract.ILoginView view) {
        super(model, view);
    }

    public void login(String phone, String pwd) {
        /*if (!VerificationUtils.matcherPhoneNum(phone)) {
            mView.checkPhoneError();
            return;
        } else {
            mView.checkPhoneSuccess();
        }
        mModel.login(phone, pwd)
                .compose(RxHttpReponseCompat.<LoginBean>compatResult())
                .subscribe(new ErrorHandlerSubscriber<LoginBean>(mContext) {
                    @Override
                    public void onSubscribe(Disposable d) {
                        mView.showLoading();
                    }

                    @Override
                    public void onComplete() {

                        mView.dismissLoading();
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        mView.dismissLoading();
                    }

                    @Override
                    public void onNext(LoginBean loginBean) {
                        mView.loginSuccess(loginBean);
                        saveUser(loginBean);
                        //RxBus.get().post(loginBean.getUser());
                        RxBus.getDefault().post(loginBean.getUser()); // 发送数据
                    }
                });*/
    }

    /*private void saveUser(LoginBean bean) {
        ACache aCache = ACache.get(mContext);
        aCache.put(Constant.TOKEN, bean.getToken());
        aCache.put(Constant.USER, bean.getUser());
    }*/

}
