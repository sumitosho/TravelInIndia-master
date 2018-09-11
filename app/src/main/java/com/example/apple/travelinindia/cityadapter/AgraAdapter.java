package com.example.apple.travelinindia.cityadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.travelinindia.R;

import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.datamodel.DataModelTravel;

import java.util.ArrayList;

public class AgraAdapter extends RecyclerView.Adapter<AgraAdapter.MyAgraViewHolder>  {

    private ArrayList<CityModel> agarData;
    Context context;


    public class MyAgraViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyAgraViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }

    }
    public AgraAdapter( ArrayList<CityModel> data ){

        this.agarData = data;

    }


    @NonNull
    @Override
    public AgraAdapter.MyAgraViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyAgraViewHolder myAgraViewHolder = new MyAgraViewHolder(view);
       return myAgraViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull AgraAdapter.MyAgraViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(agarData.get(listPosition).getName());
        textViewVersion.setText(agarData.get(listPosition).getVersion());
        imageView.setImageResource(agarData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return agarData.size();
    }


}
