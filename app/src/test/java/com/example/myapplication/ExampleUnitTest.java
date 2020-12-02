package com.example.myapplication;

import android.util.Log;

import androidx.annotation.LongDef;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() {


        double a = Math.sin(Math.toRadians(60));
        System.out.println(a);
//        assertEquals(4, 2 + 2);
    }
}