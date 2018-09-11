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

public class BengaluruAdapter extends RecyclerView.Adapter<BengaluruAdapter.MyBengaluruViewHolder>{
    private ArrayList<CityModel> bengaluruData;
    public class MyBengaluruViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyBengaluruViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public BengaluruAdapter(ArrayList<CityModel> data){
        this.bengaluruData = data;
    }
    @NonNull
    @Override
    public BengaluruAdapter.MyBengaluruViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyBengaluruViewHolder myBengaluruViewHolder = new MyBengaluruViewHolder(view);
        return myBengaluruViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull BengaluruAdapter.MyBengaluruViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(bengaluruData.get(listPosition).getName());
        textViewVersion.setText(bengaluruData.get(listPosition).getVersion());
        imageView.setImageResource(bengaluruData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return bengaluruData.size();
    }


}

