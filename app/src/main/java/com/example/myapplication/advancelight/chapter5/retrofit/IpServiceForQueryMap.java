package com.example.myapplication.advancelight.chapter5.retrofit;


import com.example.myapplication.advancelight.chapter5.retrofit.model.IpModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by Administrator on 2016/11/1 0001.
 */

public interface IpServiceForQueryMap {
    @GET("getIpInfo.php")
    Call<IpModel> getIpMsg(@QueryMap Map<String, String> options);
}
