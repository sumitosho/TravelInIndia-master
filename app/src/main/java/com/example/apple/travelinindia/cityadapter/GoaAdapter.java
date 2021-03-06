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

public class GoaAdapter extends RecyclerView.Adapter<GoaAdapter.MyGoaViewHolder>{
    private ArrayList<CityModel> goaData;
    public class MyGoaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyGoaViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }
    public GoaAdapter(ArrayList<CityModel> data){
        this.goaData = data;
    }
    @NonNull
    @Override
    public GoaAdapter.MyGoaViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyGoaViewHolder myGoaViewHolder= new MyGoaViewHolder(view);
        return myGoaViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull GoaAdapter.MyGoaViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(goaData.get(listPosition).getName());
        textViewVersion.setText(goaData.get(listPosition).getVersion());
        imageView.setImageResource(goaData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return goaData.size();
    }


}
