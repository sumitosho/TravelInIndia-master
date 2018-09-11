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

public class ThiruAdapter extends RecyclerView.Adapter<ThiruAdapter.MyThiruViewHolder> {
    private ArrayList<CityModel> thiruData;
    public class MyThiruViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyThiruViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public ThiruAdapter(ArrayList<CityModel> data){
        this.thiruData = data;
    }
    @NonNull
    @Override
    public ThiruAdapter.MyThiruViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyThiruViewHolder myThiruViewHolder  = new MyThiruViewHolder(view);
        return myThiruViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull ThiruAdapter.MyThiruViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(thiruData.get(listPosition).getName());
        textViewVersion.setText(thiruData.get(listPosition).getVersion());
        imageView.setImageResource(thiruData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return thiruData.size();
    }


}
