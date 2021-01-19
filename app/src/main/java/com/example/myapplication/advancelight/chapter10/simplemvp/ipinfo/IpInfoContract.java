package com.example.myapplication.advancelight.chapter10.simplemvp.ipinfo;

import com.example.myapplication.advancelight.chapter10.simplemvp.BaseView;
import com.example.myapplication.advancelight.chapter10.simplemvp.model.IpInfo;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 1/14/21 1:35 PM
 **/
public interface IpInfoContract {
    interface Presenter {
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
