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

public class AhmedaAdapter extends RecyclerView.Adapter<AhmedaAdapter.MyAhmedaViewHolder>{
    private ArrayList<CityModel> ahmedaData;

    public class MyAhmedaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyAhmedaViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public AhmedaAdapter(ArrayList<CityModel> data){
        this.ahmedaData = data;
    }
    @NonNull
    @Override
    public AhmedaAdapter.MyAhmedaViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyAhmedaViewHolder myAhmedaViewHolder = new MyAhmedaViewHolder(view);
        return myAhmedaViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull AhmedaAdapter.MyAhmedaViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(ahmedaData.get(listPosition).getName());
        textViewVersion.setText(ahmedaData.get(listPosition).getVersion());
        imageView.setImageResource(ahmedaData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return ahmedaData.size();
    }



}
