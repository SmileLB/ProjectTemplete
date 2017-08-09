package com.example.administrator.superdemo.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.administrator.superdemo.R;
import com.example.administrator.superdemo.bean.LoginBean;
import com.example.administrator.superdemo.di.component.AppComponent;
import com.example.administrator.superdemo.presenter.LoginPresenter;
import com.example.administrator.superdemo.presenter.contract.LoginContract;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.ILoginView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    public void setupActivityComponent(AppComponent appComponent) {
        /*DaggerLoginComponent.builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);*/
    }

    @Override
    public void init() {
        initView();
    }

    private void initView() {

        /*mToolBar.setNavigationIcon(
                new IconicsDrawable(this)
                        .icon(Ionicons.Icon.ion_ios_arrow_back)
                        .sizeDp(16)
                        .color(getResources().getColor(R.color.md_white_1000)
                        )
        );

        mToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        InitialValueObservable<CharSequence> obMobi = RxTextView.textChanges(mTxtMobi);
        InitialValueObservable<CharSequence> obPassword = RxTextView.textChanges(mTxtPassword);

        Observable.combineLatest(obMobi, obPassword, new BiFunction<CharSequence, CharSequence, Boolean>() {
            @Override
            public Boolean apply(@NonNull CharSequence mobi, @NonNull CharSequence pwd) throws Exception {
                return isPhoneValid(mobi.toString()) && isPasswordValid(pwd.toString());
            }
        }).subscribe(new Consumer<Boolean>() {
            @Override
            public void accept(@NonNull Boolean aBoolean) throws Exception {
                RxView.enabled(mBtnLogin).accept(aBoolean);
            }
        });

        RxView.clicks(mBtnLogin).subscribe(new Consumer<Object>() {
            @Override
            public void accept(@NonNull Object o) throws Exception {
                mPresenter.login(mTxtMobi.getText().toString().trim(), mTxtPassword.getText().toString().trim());
            }
        });*/
    }

    private boolean isPhoneValid(String phone) {
        return phone.length() == 11;
    }

    private boolean isPasswordValid(String password) {
        return password.length() >= 6;
    }


    @Override
    public void checkPhoneError() {
//        mViewMobiWrapper.setError("手机号格式不正确");
    }

    @Override
    public void checkPhoneSuccess() {
//        mViewMobiWrapper.setError("");
//        mViewMobiWrapper.setErrorEnabled(false);
    }

    @Override
    public void loginSuccess(LoginBean bean) {

        this.finish();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void dismissLoading() {

    }
}