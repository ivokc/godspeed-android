package com.example.myapplication.advancelight.chapter9.dagger2.model;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/12/21 0021.
 */

public class Swordsman {
    private String name;
    private String level;
    public Swordsman(String name,String level){
        this.name=name;
        this.level=level;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }
    @Inject
    public Swordsman(){

    }
    public String fighting() {

        return "欲为大树，莫与草争";
    }
}
