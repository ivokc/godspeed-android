package com.example.myapplication.art.chapter2;

import android.os.RemoteException;

import com.example.myapplication.ISecurityCenter;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 2020/10/21 10:49 AM
 **/
public class SecurityCenterImpl extends ISecurityCenter.Stub {
    private static final char SECRET_CODE = '^';

    @Override
    public String encrypt(String content) throws RemoteException {
        char[] chars = content.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] ^= SECRET_CODE;
        }
        return new String(chars);
    }

    @Override
    public String decrypt(String password) throws RemoteException {
        return encrypt(password);
    }
}
