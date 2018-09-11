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

public class MumbaiAdapter extends RecyclerView.Adapter<MumbaiAdapter.MyMumbaiViewHolder> {
    private ArrayList<CityModel> mumabiData;
    public class MyMumbaiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyMumbaiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public MumbaiAdapter(ArrayList<CityModel> data){
        this.mumabiData = data;
    }
    @NonNull
    @Override
    public MumbaiAdapter.MyMumbaiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyMumbaiViewHolder myMumbaiViewHolder  = new MyMumbaiViewHolder(view);
        return myMumbaiViewHolder;

    }

    @Override
    public void onBindViewHolder( @NonNull MumbaiAdapter.MyMumbaiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(mumabiData.get(listPosition).getName());
        textViewVersion.setText(mumabiData.get(listPosition).getVersion());
        imageView.setImageResource(mumabiData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return mumabiData.size();
    }


}
