package com.example.myapplication.advancelight.chapter10.simplemvp.ipinfo;


import com.example.myapplication.advancelight.chapter10.simplemvp.model.IpInfo;
import com.example.myapplication.advancelight.chapter10.simplemvp.net.LoadTasksCallBack;
import com.example.myapplication.advancelight.chapter10.simplemvp.net.NetTask;

/**
 * Created by Administrator on 2016/12/29 0029.
 */

public class IpInfoPresenter implements IpInfoContract.Presenter, LoadTasksCallBack<IpInfo> {
    private NetTask netTask;
    private IpInfoContract.View addTaskView;

    public IpInfoPresenter(IpInfoContract.View addTaskView, NetTask netTask) {
        this.netTask = netTask;
        this.addTaskView=addTaskView;
    }
    @Override
    public void getIpInfo(String ip) {
        netTask.execute(ip,this);
    }

    @Override
    public void onSuccess(IpInfo ipInfo) {
        if(addTaskView.isActive()){
            addTaskView.setIpInfo(ipInfo);
        }
    }

    @Override
    public void onStart() {
        if(addTaskView.isActive()){
            addTaskView.showLoading();
        }
    }

    @Override
    public void onFailed() {
        if(addTaskView.isActive()){
            addTaskView.showError();
            addTaskView.hideLoading();
        }
    }

    @Override
    public void onFinish() {
        if(addTaskView.isActive()){
            addTaskView.hideLoading();
        }
    }
}
