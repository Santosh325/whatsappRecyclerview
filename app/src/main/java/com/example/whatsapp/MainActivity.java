package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycleview);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        String name[] = {"Ram","Arjun","John","Gopal","Doe","Harry","David","Kyale","Silva","Alexander","steven","Laxman","Anup","Samir","Helen"};
        String time[] = {"01/01/2020","2:12","1:06","1:30","2:12","1:06","1:30","2:12","1:06","1:30","2:12","1:06","1:30","2:12","1:06"};
        int[] images = {
                R.drawable.one,
                R.drawable.two,
                R.drawable.three,
                R.drawable.four,
                R.drawable.five,
                R.drawable.six,
                R.drawable.seven,
                R.drawable.eight,
                R.drawable.nine,
                R.drawable.ten,
                R.drawable.eleven,
                R.drawable.twelve,
                R.drawable.one,
                R.drawable.two,
                R.drawable.three
        };
        mRecyclerView.setAdapter(new Whatsappname(name,time,images));




    }

}
