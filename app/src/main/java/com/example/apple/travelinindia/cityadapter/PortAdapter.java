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

public class PortAdapter extends RecyclerView.Adapter<PortAdapter.MyPortViewHolder>{
    private ArrayList<CityModel> portData;
    public class MyPortViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyPortViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public PortAdapter(ArrayList<CityModel> data){
        this.portData = data;
    }
    @NonNull
    @Override
    public PortAdapter.MyPortViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyPortViewHolder myPortViewHolder  = new MyPortViewHolder(view);
        return myPortViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull PortAdapter.MyPortViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(portData.get(listPosition).getName());
        textViewVersion.setText(portData.get(listPosition).getVersion());
        imageView.setImageResource(portData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return portData.size();
    }


}
