package com.example.myapplication.advancelight.chapter10.rxjavamvp.ipinfo;


import com.example.myapplication.advancelight.chapter10.rxjavamvp.BasePresenter;
import com.example.myapplication.advancelight.chapter10.rxjavamvp.BaseView;
import com.example.myapplication.advancelight.chapter10.rxjavamvp.model.IpInfo;

public interface IpInfoContract {
    interface Presenter extends BasePresenter {
        void getIpInfo(String ip);
    }

    interface View extends BaseView<Presenter> {
        void setIpInfo(IpInfo ipInfo);
        void showLoading();
        void hideLoading();
        void showError();
        boolean isActive();
    }
}
