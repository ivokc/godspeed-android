package com.example.myapplication.advancelight.chapter1.recycleview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity {


    private List<String> mList;
    private HomeAdapter mHomeAdaper;
    private RecyclerView mRecyclerView;
    private StaggeredHomeAdapter mStaggeredHomeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);

        initData();
        initView();
    }

    private void initData() {
        mList=new ArrayList<String>();
        for (int i = 1; i < 20; i++)
        {
            mList.add(i+"");
        }
    }


    private void initView() {
        mRecyclerView= (RecyclerView) this.findViewById(R.id.id_recyclerview);
        //设置GridView
//        setGridView();
        //设置ListView
//        setListView();
        //设置瀑布流
        setWaterfallView();

    }

    public void setListView(){
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(RecycleViewActivity.this, DividerItemDecoration.VERTICAL_LIST));

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mHomeAdaper=new HomeAdapter(this, mList);
        mRecyclerView.setAdapter(mHomeAdaper);
        setLister();
    }

    public void setGridView(){
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,
                StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mHomeAdaper=new HomeAdapter(this, mList);
        setLister();
        mRecyclerView.setAdapter(mHomeAdaper);
    }
    public void setWaterfallView(){
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(4,
                StaggeredGridLayoutManager.VERTICAL));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mStaggeredHomeAdapter=new StaggeredHomeAdapter(this, mList);
        mRecyclerView.setAdapter(mStaggeredHomeAdapter);
        mStaggeredHomeAdapter.setOnItemClickLitener(new StaggeredHomeAdapter.OnItemClickLitener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecycleViewActivity.this, "点击第" + (position + 1) + "条", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, final int position) {
                new AlertDialog.Builder(RecycleViewActivity.this)
                        .setTitle("确认删除吗？")
                        .setNegativeButton("取消", null)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                mHomeAdaper.removeData(position);
                            }
                        })
                        .show();
            }
        });
    }
    private void setLister(){
        mHomeAdaper.setOnItemClickListener(new HomeAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(RecycleViewActivity.this, "点击第" + (position + 1) + "条", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemLongClick(View view, final int position) {
                new AlertDialog.Builder(RecycleViewActivity.this)
                        .setTitle("确认删除吗？")
                        .setNegativeButton("取消", null)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                mHomeAdaper.removeData(position);
                            }
                        })
                        .show();
            }
        });
    }

}