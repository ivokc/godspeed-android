package com.example.myapplication.advancelight.chapter5.retrofit;

import com.example.myapplication.advancelight.chapter5.retrofit.model.Ip;
import com.example.myapplication.advancelight.chapter5.retrofit.model.IpModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Administrator on 2016/11/1 0001.
 */

public interface IpServiceForPostBody {
    @POST("getIpInfo.php")
    Call<IpModel> getIpMsg(@Body Ip ip);
}
