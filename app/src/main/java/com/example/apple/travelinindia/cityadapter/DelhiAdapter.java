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

public class DelhiAdapter extends RecyclerView.Adapter<DelhiAdapter.MyDelhiViewHolder> {
    private ArrayList<CityModel> delhiData;
    public class MyDelhiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyDelhiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public DelhiAdapter( ArrayList<CityModel> data ){

        this.delhiData = data;

    }
    @NonNull
    @Override
    public DelhiAdapter.MyDelhiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyDelhiViewHolder mydelhiViewHolder = new MyDelhiViewHolder(view);
        return mydelhiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull DelhiAdapter.MyDelhiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(delhiData.get(listPosition).getName());
        textViewVersion.setText(delhiData.get(listPosition).getVersion());
        imageView.setImageResource(delhiData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return delhiData.size();
    }


}
