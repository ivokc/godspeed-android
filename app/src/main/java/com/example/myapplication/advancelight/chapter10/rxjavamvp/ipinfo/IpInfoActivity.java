package com.example.myapplication.advancelight.chapter10.rxjavamvp.ipinfo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.MyApplication;
import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter10.simplemvp.util.ActivityUtils;

public class IpInfoActivity extends AppCompatActivity {
//    @Inject
    IpInfoPresenter ipInfoPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ip_info);
        IpInfoFragment ipInfoFragment = (IpInfoFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (ipInfoFragment == null) {
            ipInfoFragment = IpInfoFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    ipInfoFragment, R.id.contentFrame);
        }
//        IpInfoTask ipInfoTask = new IpInfoTask();
//        ipInfoPresenter = new IpInfoPresenter(ipInfoFragment, ipInfoTask);
//        ipInfoFragment.setPresenter(ipInfoPresenter);
        DaggerIpInfoComponent.builder().ipInfoModule(new IpInfoModule(ipInfoFragment)).netTaskComponent(((MyApplication) getApplication()).getTasksRepositoryComponent()).build().inject(this);
    }
}