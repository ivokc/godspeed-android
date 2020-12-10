package com.example.myapplication.advancelight.chapter1.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.List;

/**
 * @name My Application
 * @class describe
 * @anthor jijiaming
 * @time 2020/12/8 4:45 PM
 **/
public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder>  implements View.OnClickListener, View.OnLongClickListener {

    private List<String> mList;
    private Context mContext;;
    private OnItemClickListener mOnItemClickListener;

    public HomeAdapter(Context mContext,List<String>mList){
        this.mContext=mContext;
        this.mList=mList;
    }
    public interface OnItemClickListener{
        void onItemClick(View view, int position);
        void onItemLongClick(View view,int position);

    }

    public void setOnItemClickListener(OnItemClickListener mOnItemClickListener){
        this.mOnItemClickListener = mOnItemClickListener;
    }

    public void removeData(int position) {
        mList.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public void onClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(view,(int)view.getTag());
        }
    }

    @Override
    public boolean onLongClick(View view) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemLongClick(view,(int)view.getTag());
        }
        return true;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(
                mContext).inflate(R.layout.item_recycler, parent,
                false);
        MyViewHolder holder = new MyViewHolder(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.itemView.setTag(position);
        holder.tv.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView tv;
        public MyViewHolder(View view){
            super(view);
            tv = (TextView) view.findViewById(R.id.tv_item);
        }
    }
}
