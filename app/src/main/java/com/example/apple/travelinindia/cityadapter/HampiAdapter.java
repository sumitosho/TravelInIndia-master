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

public class HampiAdapter extends RecyclerView.Adapter<HampiAdapter.MyHampiViewHolder> {
    private ArrayList<CityModel> hampiData;
    public class MyHampiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyHampiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }
    public HampiAdapter(ArrayList<CityModel> data) {
        this.hampiData = data;
    }
    @NonNull
    @Override
    public HampiAdapter.MyHampiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyHampiViewHolder myHampiViewHolder = new MyHampiViewHolder(view);
        return myHampiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull HampiAdapter.MyHampiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(hampiData.get(listPosition).getName());
        textViewVersion.setText(hampiData.get(listPosition).getVersion());
        imageView.setImageResource(hampiData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return hampiData.size();
    }


}
