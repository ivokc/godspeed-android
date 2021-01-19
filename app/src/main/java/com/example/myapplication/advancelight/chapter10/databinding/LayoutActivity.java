package com.example.myapplication.advancelight.chapter10.databinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter10.databinding.model.Swordsman;
import com.example.myapplication.databinding.ActivityLayoutBinding;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLayoutBinding binding= DataBindingUtil.setContentView(this, R.layout.activity_layout);
        binding.setName("风清扬");
        binding.setAge(70);
        binding.setMan(true);

        ArrayList list=new ArrayList();
        list.add("0");
        list.add("1");
        binding.setList(list);

        Map map=new HashMap();
        map.put("age","30");
        binding.setMap(map);

        String[] arrays = {"张无忌", "慕容龙城"};
        binding.setArrays(arrays);

        Swordsman swordsman=new Swordsman("独孤求败","SS");
        binding.setSwordsman(swordsman);

        binding.setTime(new Date());

    }
}