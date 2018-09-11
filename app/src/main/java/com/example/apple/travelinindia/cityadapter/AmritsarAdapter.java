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
import com.example.apple.travelinindia.mydata.AmirtsarData;

import java.util.ArrayList;

public class AmritsarAdapter extends RecyclerView.Adapter<AmritsarAdapter.MyAmritsarViewHolder> {
    private ArrayList<CityModel> amritsarData;
    public class MyAmritsarViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyAmritsarViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public AmritsarAdapter(ArrayList<CityModel> data){
        this.amritsarData = data;
    }
    @NonNull
    @Override
    public AmritsarAdapter.MyAmritsarViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyAmritsarViewHolder myAmritsarViewHolder = new MyAmritsarViewHolder(view);
        return myAmritsarViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull AmritsarAdapter.MyAmritsarViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(amritsarData.get(listPosition).getName());
        textViewVersion.setText(amritsarData.get(listPosition).getVersion());
        imageView.setImageResource(amritsarData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return amritsarData.size();
    }


}
