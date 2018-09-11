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

public class DarjeelingAdapter extends RecyclerView.Adapter<DarjeelingAdapter.MyDarjeeViewHolder>{

    private ArrayList<CityModel> darjeelingData;

    public class MyDarjeeViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyDarjeeViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public DarjeelingAdapter(ArrayList<CityModel> data){
        this.darjeelingData = data;
    }
    @NonNull
    @Override
    public DarjeelingAdapter.MyDarjeeViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyDarjeeViewHolder myDarjeeViewHolder = new MyDarjeeViewHolder(view);
        return myDarjeeViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull DarjeelingAdapter.MyDarjeeViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(darjeelingData.get(listPosition).getName());
        textViewVersion.setText(darjeelingData.get(listPosition).getVersion());
        imageView.setImageResource(darjeelingData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return darjeelingData.size();
    }


}
