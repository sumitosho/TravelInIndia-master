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

public class AlappuzhaAdapter extends RecyclerView.Adapter<AlappuzhaAdapter.MyAlaappuViewHolder>{
    private ArrayList<CityModel> alappuzhaData;

    public class MyAlaappuViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyAlaappuViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public AlappuzhaAdapter(ArrayList<CityModel> data) {
        this.alappuzhaData = data;
    }
    @NonNull
    @Override
    public AlappuzhaAdapter.MyAlaappuViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyAlaappuViewHolder myAlaappuViewHolder = new MyAlaappuViewHolder(view);
        return myAlaappuViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull AlappuzhaAdapter.MyAlaappuViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(alappuzhaData.get(listPosition).getName());
        textViewVersion.setText(alappuzhaData.get(listPosition).getVersion());
        imageView.setImageResource(alappuzhaData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return alappuzhaData.size();
    }


}
