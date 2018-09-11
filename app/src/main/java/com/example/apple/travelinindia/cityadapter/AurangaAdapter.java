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

public class AurangaAdapter  extends RecyclerView.Adapter<AurangaAdapter.MyAurangaViewHolder>{
    private ArrayList<CityModel> aurangaData;
    public class MyAurangaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyAurangaViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public AurangaAdapter(ArrayList<CityModel> data) {
        this.aurangaData = data;

    }
    @NonNull
    @Override
    public AurangaAdapter.MyAurangaViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyAurangaViewHolder myAurangaViewHolder = new MyAurangaViewHolder(view);
        return myAurangaViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull AurangaAdapter.MyAurangaViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(aurangaData.get(listPosition).getName());
        textViewVersion.setText(aurangaData.get(listPosition).getVersion());
        imageView.setImageResource(aurangaData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return aurangaData.size();
    }


}
