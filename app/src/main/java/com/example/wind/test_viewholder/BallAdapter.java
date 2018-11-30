package com.example.wind.test_viewholder;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class BallAdapter extends RecyclerView.Adapter<BallAdapter.ViewHolder> {

   private List<Ball> mBallList = new ArrayList<Ball>();

   class ViewHolder extends RecyclerView.ViewHolder{

       TextView ballName;

       public ViewHolder(View view){
           super(view);
           ballName = (TextView)view.findViewById(R.id.ball_name);
       }
   }

   public BallAdapter(List<Ball> BallList){
       mBallList = BallList;
   }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mBallList.size();
    }
}
