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

public class FatehpurAdapter extends RecyclerView.Adapter<FatehpurAdapter.MyFateViewHolder>{
    private ArrayList<CityModel> fatehpurData;

    public class MyFateViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyFateViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public FatehpurAdapter(ArrayList<CityModel> data){
        this.fatehpurData = data;
    }
    @NonNull
    @Override
    public FatehpurAdapter.MyFateViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyFateViewHolder  myFateViewHolder= new MyFateViewHolder(view);
        return myFateViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull FatehpurAdapter.MyFateViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(fatehpurData.get(listPosition).getName());
        textViewVersion.setText(fatehpurData.get(listPosition).getVersion());
        imageView.setImageResource(fatehpurData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return fatehpurData.size();
    }


}
