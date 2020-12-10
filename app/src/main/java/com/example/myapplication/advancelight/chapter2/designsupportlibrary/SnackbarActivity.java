package com.example.myapplication.advancelight.chapter2.designsupportlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.google.android.material.snackbar.Snackbar;

public class SnackbarActivity extends AppCompatActivity {


    private Button bt_snackbar;
    private Button bt_textInputLayout;
    private RelativeLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);
        activity_main = (RelativeLayout) this.findViewById(R.id.activity_main);
        bt_textInputLayout= (Button) this.findViewById(R.id.bt_textInputLayout);
        bt_snackbar = (Button) this.findViewById(R.id.bt_snackbar);
        bt_textInputLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SnackbarActivity.this,TextInputLayoutActivity.class);
                startActivity(intent);
            }
        });

        bt_snackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });
    }

    private void showSnackbar() {
        Snackbar.make(activity_main, "标题", Snackbar.LENGTH_LONG)
                .setAction("点击事件", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                SnackbarActivity.this,
                                "Toast",
                                Toast.LENGTH_SHORT).show();
                    }
                }).setDuration(Snackbar.LENGTH_LONG).show();
    }
}