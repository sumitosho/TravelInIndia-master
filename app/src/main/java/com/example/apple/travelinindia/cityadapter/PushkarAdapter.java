package com.example.apple.travelinindia.cityadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.datamodel.CityModel;

import java.util.ArrayList;

public class PushkarAdapter extends RecyclerView.Adapter<PushkarAdapter.MyPushkarViewHolder>{
    private ArrayList<CityModel> pushkarData;
    public class MyPushkarViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyPushkarViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public PushkarAdapter(ArrayList<CityModel> data){
        this.pushkarData = data;
    }
    @NonNull
    @Override
    public PushkarAdapter.MyPushkarViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyPushkarViewHolder myPushkarViewHolder  = new MyPushkarViewHolder(view);
        return myPushkarViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull PushkarAdapter.MyPushkarViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(pushkarData.get(listPosition).getName());
        textViewVersion.setText(pushkarData.get(listPosition).getVersion());
        imageView.setImageResource(pushkarData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return pushkarData.size();
    }


}
