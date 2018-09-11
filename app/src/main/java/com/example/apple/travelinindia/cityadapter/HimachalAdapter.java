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

public class HimachalAdapter extends RecyclerView.Adapter<HimachalAdapter.MyHimachalViewHolder>{
    private ArrayList<CityModel> himachalData;
    public class MyHimachalViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyHimachalViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public HimachalAdapter(ArrayList<CityModel> data){
        this.himachalData = data;
    }
    @NonNull
    @Override
    public HimachalAdapter.MyHimachalViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

      MyHimachalViewHolder myHimachalViewHolder  = new MyHimachalViewHolder(view);
        return myHimachalViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull HimachalAdapter.MyHimachalViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(himachalData.get(listPosition).getName());
        textViewVersion.setText(himachalData.get(listPosition).getVersion());
        imageView.setImageResource(himachalData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return himachalData.size();
    }


}
