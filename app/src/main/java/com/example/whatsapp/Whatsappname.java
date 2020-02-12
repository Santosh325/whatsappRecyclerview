package com.example.whatsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Whatsappname extends RecyclerView.Adapter<Whatsappname.CourseViewHolder> {

    private String[] data;
    private String[] time;
    int[] images;
    public Whatsappname(String[] data,String[] time,int[] images) {
        this.data = data;
        this.time = time;
        this.images = images;

    }


    @Override
    public CourseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item,parent,false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
            String title = data[position];
            holder.mTextView.setText(title);
            String timeOne = time[position];
            holder.mTime.setText(timeOne);
            int image_id = images[position];
            holder.mImageView.setImageResource(image_id);


    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class CourseViewHolder extends RecyclerView.ViewHolder{
        ImageView mImageView;
        TextView mTextView;
        TextView mTime;
        public CourseViewHolder(View itemview) {
            super(itemview);
            mImageView = itemview.findViewById(R.id.imageview);
            mTextView= itemview.findViewById(R.id.title);
            mTime = itemview.findViewById(R.id.time);
        }
    }
}
