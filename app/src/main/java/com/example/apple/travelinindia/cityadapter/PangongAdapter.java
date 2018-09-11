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

public class PangongAdapter extends RecyclerView.Adapter<PangongAdapter.MyPangongVieHolder>{
    private ArrayList<CityModel> pangongData;
    public class MyPangongVieHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyPangongVieHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public PangongAdapter(ArrayList<CityModel> data) {
        this.pangongData = data;
    }
    @NonNull
    @Override
    public PangongAdapter.MyPangongVieHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyPangongVieHolder myPangongVieHolder  = new MyPangongVieHolder(view);
        return myPangongVieHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull PangongAdapter.MyPangongVieHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(pangongData.get(listPosition).getName());
        textViewVersion.setText(pangongData.get(listPosition).getVersion());
        imageView.setImageResource(pangongData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return pangongData.size();
    }


}
