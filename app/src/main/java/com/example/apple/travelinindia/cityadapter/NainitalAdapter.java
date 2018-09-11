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

public class NainitalAdapter  extends RecyclerView.Adapter<NainitalAdapter.MyNainiViewHolder>{
    private ArrayList<CityModel> nainitalData;
    public class MyNainiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyNainiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public NainitalAdapter(ArrayList<CityModel> data){
        this.nainitalData = data;
    }
    @NonNull
    @Override
    public NainitalAdapter.MyNainiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyNainiViewHolder myNainiViewHolder  = new MyNainiViewHolder(view);
        return myNainiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull NainitalAdapter.MyNainiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(nainitalData.get(listPosition).getName());
        textViewVersion.setText(nainitalData.get(listPosition).getVersion());
        imageView.setImageResource(nainitalData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return nainitalData.size();
    }


}
