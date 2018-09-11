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

public class MysoreAdapter extends RecyclerView.Adapter<MysoreAdapter.MyMysoreViewHolder>{
    private ArrayList<CityModel> mysoreData;
    public class MyMysoreViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyMysoreViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public MysoreAdapter(ArrayList<CityModel> data) {
        this.mysoreData = data;
    }
    @NonNull
    @Override
    public MysoreAdapter.MyMysoreViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyMysoreViewHolder myMysoreViewHolder  = new MyMysoreViewHolder(view);
        return myMysoreViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull MysoreAdapter.MyMysoreViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(mysoreData.get(listPosition).getName());
        textViewVersion.setText(mysoreData.get(listPosition).getVersion());
        imageView.setImageResource(mysoreData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return mysoreData.size();
    }


}
