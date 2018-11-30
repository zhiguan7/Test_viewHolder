package com.example.wind.test_viewholder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Ball> ballList = new ArrayList<>();
    private  BallAdapter adapter;

    public void addBall(){
        for (int i = 0; i < 100; i++){
        Ball ball_1 = new Ball("篮球");
        ballList.add(ball_1);
        Ball ball_2 = new Ball("足球");
        ballList.add(ball_2);
        Ball ball_3 = new Ball("乒乓球");
        ballList.add(ball_3);
        Ball ball_4 = new Ball("网球");
        ballList.add(ball_4);
        Ball ball_5 = new Ball("羽毛球");
        ballList.add(ball_5);
        Ball ball_6 = new Ball("桌球");
        ballList.add(ball_6);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addBall();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new  StaggeredGridLayoutManager(8, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new BallAdapter(ballList);
        recyclerView.setAdapter(adapter);
    }
}
