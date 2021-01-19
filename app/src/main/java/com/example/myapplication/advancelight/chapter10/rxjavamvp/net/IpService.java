package com.example.myapplication.advancelight.chapter10.rxjavamvp.net;


import com.example.myapplication.advancelight.chapter10.rxjavamvp.model.IpInfo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Administrator on 2016/12/30 0030.
 */

public interface IpService {
    @FormUrlEncoded
    @POST("getIpInfo.php")
    Observable<IpInfo> getIpInfo(@Field("ip") String ip);
}
