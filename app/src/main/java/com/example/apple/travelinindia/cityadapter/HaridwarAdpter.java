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

public class HaridwarAdpter extends RecyclerView.Adapter<HaridwarAdpter.MyHariViewHolder>{
    private ArrayList<CityModel> haridwarData;
    public class MyHariViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyHariViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public HaridwarAdpter(ArrayList<CityModel> data){
        this.haridwarData = data;
    }
    @NonNull
    @Override
    public HaridwarAdpter.MyHariViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyHariViewHolder myHariViewHolder = new MyHariViewHolder(view);
        return myHariViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull HaridwarAdpter.MyHariViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(haridwarData.get(listPosition).getName());
        textViewVersion.setText(haridwarData.get(listPosition).getVersion());
        imageView.setImageResource(haridwarData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return haridwarData.size();
    }


}
