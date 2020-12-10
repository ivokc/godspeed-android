// ISecurityCenter.aidl
package com.example.myapplication.art.chapter2.binderpool;

// Declare any non-default types here with import statements

interface ISecurityCenter {
    String encrypt(String content);
    String decrypt(String password);
}
