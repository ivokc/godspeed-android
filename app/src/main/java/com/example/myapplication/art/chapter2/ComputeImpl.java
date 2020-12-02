package com.example.myapplication.art.chapter2;

import android.os.RemoteException;

import com.example.myapplication.ICompute;

public class ComputeImpl extends ICompute.Stub {

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

}
