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

public class MunnarAdapter extends RecyclerView.Adapter<MunnarAdapter.MyMunnarViewHolder>{
    private ArrayList<CityModel> munnarData;
    public class MyMunnarViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyMunnarViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public MunnarAdapter(ArrayList<CityModel> data){
        this.munnarData = data;
    }
    @NonNull
    @Override
    public MunnarAdapter.MyMunnarViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyMunnarViewHolder myMunnarViewHolder  = new MyMunnarViewHolder(view);
        return myMunnarViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull MunnarAdapter.MyMunnarViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(munnarData.get(listPosition).getName());
        textViewVersion.setText(munnarData.get(listPosition).getVersion());
        imageView.setImageResource(munnarData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return munnarData.size();
    }


}
