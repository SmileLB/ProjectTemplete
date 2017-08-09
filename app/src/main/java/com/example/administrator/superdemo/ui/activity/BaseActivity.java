package com.example.administrator.superdemo.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.superdemo.AppApplication;
import com.example.administrator.superdemo.di.component.AppComponent;
import com.example.administrator.superdemo.presenter.BasePresenter;
import com.example.administrator.superdemo.ui.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView {

    private Unbinder mBind;

    protected AppApplication mApplication;

    @Inject
    T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(setLayout());

        mBind = ButterKnife.bind(this);

        this.mApplication = (AppApplication) getApplication();
        setupActivityComponent(mApplication.getAppComponent());

        init();
    }

    public abstract int setLayout();

    public abstract void setupActivityComponent(AppComponent appComponent);

    public void startActivity(Class c) {
        startActivity(new Intent(this, c));
    }

    public abstract void init();

    @Override
    public void showLoading() {

    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mBind != mBind.EMPTY) {
            mBind.unbind();
        }
    }
}
