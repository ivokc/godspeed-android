// IOnNewBookArrivedListener.aidl
package com.example.myapplication;

// Declare any non-default types here with import statements
import com.example.myapplication.Book;

interface IOnNewBookArrivedListener {
    void onNewBookArrived(in Book newBook);

}
