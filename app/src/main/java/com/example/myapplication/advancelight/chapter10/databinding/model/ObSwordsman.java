package com.example.myapplication.advancelight.chapter10.databinding.model;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.myapplication.BR;

public class ObSwordsman extends BaseObservable {
    private String name;
    private String level;

    public ObSwordsman(String name, String level) {
        this.name = name;
        this.level = level;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
    @Bindable
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
        notifyPropertyChanged(BR.level);
    }
}
