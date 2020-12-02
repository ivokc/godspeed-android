package com.example.myapplication.art.chapter2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.example.myapplication.IPerson;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 2020/10/12 3:22 PM
 **/
public class AIDLService extends Service {
    private static final String TAG = "AIDLService";
    private IBinder binder = new PersonQueryBinder();
    private String[] names = {"B神","艹神","基神","J神","翔神"};

    private String query(int num)
    {
        if(num > 0 && num < 6){
            return names[num - 1];
        }
        return null;
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: ");
        return binder;
    }

    private final class PersonQueryBinder extends IPerson.Stub {
        @Override
        public String queryPerson(int num) throws RemoteException {
            return query(num);
        }
    }
}
