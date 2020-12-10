// IOnNewBookArrivedListener.aidl
package com.example.myapplication.art.chapter2.aidl;

// Declare any non-default types here with import statements
import com.example.myapplication.art.chapter2.aidl.Book;

interface IOnNewBookArrivedListener {
    void onNewBookArrived(in Book newBook);
}

