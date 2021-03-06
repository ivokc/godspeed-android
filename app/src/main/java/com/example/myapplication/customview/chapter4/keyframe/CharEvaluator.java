package com.example.myapplication.customview.chapter4.keyframe;

import android.animation.TypeEvaluator;

/**
 * Created by qijian on 16/12/15.
 */
public class CharEvaluator implements TypeEvaluator<Character> {
    public Character evaluate(float fraction, Character startValue, Character endValue) {
        int startInt  = (int)startValue;
        int endInt = (int)endValue;
        int curInt = (int)(startInt + fraction *(endInt - startInt));
        char result = (char)curInt;
        return result;
    }
}
