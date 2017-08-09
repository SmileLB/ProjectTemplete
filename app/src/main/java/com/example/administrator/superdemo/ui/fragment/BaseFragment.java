package com.example.administrator.superdemo.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.administrator.superdemo.AppApplication;
import com.example.administrator.superdemo.di.component.AppComponent;
import com.example.administrator.superdemo.presenter.BasePresenter;
import com.example.administrator.superdemo.ui.BaseView;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by LiBing
 * on 2017/7/2 0002
 * describe:
 */

public abstract class BaseFragment<T extends BasePresenter> extends Fragment implements BaseView {

    private Unbinder mBind;

    private AppApplication mApplication;

    @Inject
    T mPresenter;

    private View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(setLayout(), container, false);
        mBind = ButterKnife.bind(this, mView);
        return mView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.mApplication = (AppApplication) getActivity().getApplication();
        setupFragmentComponent(mApplication.getAppComponent());
        init();
    }

    public abstract int setLayout();

    public abstract void setupFragmentComponent(AppComponent appComponent);

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
    public void onDestroy() {
        super.onDestroy();
        if (mBind != mBind.EMPTY) {
            mBind.unbind();
        }
    }

}
