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

public class UdaipurAdapter extends RecyclerView.Adapter<UdaipurAdapter.MyUdaiViewHolder>{
    private ArrayList<CityModel> udapiData;
    public class MyUdaiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyUdaiViewHolder( View itemView ) {
            super(itemView);

            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);

        }
    }

    public UdaipurAdapter(ArrayList<CityModel> data){
        this.udapiData = data;
    }
    @NonNull
    @Override
    public UdaipurAdapter.MyUdaiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyUdaiViewHolder myUdaiViewHolder  = new MyUdaiViewHolder(view);
        return myUdaiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull UdaipurAdapter.MyUdaiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(udapiData.get(listPosition).getName());
        textViewVersion.setText(udapiData.get(listPosition).getVersion());
        imageView.setImageResource(udapiData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return udapiData.size();
    }


}
