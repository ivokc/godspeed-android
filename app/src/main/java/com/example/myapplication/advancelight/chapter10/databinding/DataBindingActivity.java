package com.example.myapplication.advancelight.chapter10.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myapplication.R;
import com.example.myapplication.advancelight.chapter10.databinding.model.Swordsman;
import com.example.myapplication.databinding.ActivityDataBindingBinding;

public class DataBindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        Swordsman swordsman=new Swordsman("张无忌","S");
        binding.setSwordsman(swordsman);
        binding.btLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DataBindingActivity.this,LayoutActivity.class);
                startActivity(intent);
            }
        });

        binding.btUpdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DataBindingActivity.this,UpdateActivity.class);
                startActivity(intent);
            }
        });
        binding.btRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DataBindingActivity.this,RecyclerActivity.class);
                startActivity(intent);
            }
        });
    }
}