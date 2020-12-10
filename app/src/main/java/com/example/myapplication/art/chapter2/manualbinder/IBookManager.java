package com.example.myapplication.art.chapter2.manualbinder;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

import com.example.myapplication.art.chapter2.aidl.Book;

import java.util.List;

public interface IBookManager extends IInterface {

    static final String DESCRIPTOR = "com.ryg.chapter_2.manualbinder.IBookManager";

    static final int TRANSACTION_getBookList = (IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_addBook = (IBinder.FIRST_CALL_TRANSACTION + 1);

    public List<Book> getBookList() throws RemoteException;

    public void addBook(Book book) throws RemoteException;
}
