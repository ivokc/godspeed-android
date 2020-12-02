// IBookManager.aidl
package com.example.myapplication;

// Declare any non-default types here with import statements
import com.example.myapplication.Book;
import com.example.myapplication.IOnNewBookArrivedListener;
interface IBookManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
    List<Book> getBookList();
    void addBook(in Book book);
    void registerListener(IOnNewBookArrivedListener listener);
    void unregisterListener(IOnNewBookArrivedListener listener);


}
