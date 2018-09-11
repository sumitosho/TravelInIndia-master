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

public class PuneAdapter extends RecyclerView.Adapter<PuneAdapter.MyPuneViewHolder>{
    private ArrayList<CityModel> puneData;
    public class MyPuneViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyPuneViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public PuneAdapter(ArrayList<CityModel> data){
        this.puneData = data;
    }
    @NonNull
    @Override
    public PuneAdapter.MyPuneViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyPuneViewHolder myPuneViewHolder  = new MyPuneViewHolder(view);
        return myPuneViewHolder;


    }

    @Override
    public void onBindViewHolder( @NonNull PuneAdapter.MyPuneViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(puneData.get(listPosition).getName());
        textViewVersion.setText(puneData.get(listPosition).getVersion());
        imageView.setImageResource(puneData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return puneData.size();
    }


}
