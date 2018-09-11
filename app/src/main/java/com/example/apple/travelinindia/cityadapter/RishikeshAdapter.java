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

public class RishikeshAdapter extends RecyclerView.Adapter<RishikeshAdapter.MyRishiViewHolder>{
    private ArrayList<CityModel> rishikeshData;
    public class MyRishiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyRishiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public RishikeshAdapter(ArrayList<CityModel> data) {
        this.rishikeshData = data;
    }
    @NonNull
    @Override
    public RishikeshAdapter.MyRishiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyRishiViewHolder myRishiViewHolder  = new MyRishiViewHolder(view);
        return myRishiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull RishikeshAdapter.MyRishiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(rishikeshData.get(listPosition).getName());
        textViewVersion.setText(rishikeshData.get(listPosition).getVersion());
        imageView.setImageResource(rishikeshData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return rishikeshData.size();
    }


}
