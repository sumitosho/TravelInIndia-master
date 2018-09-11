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

public class ShimlaAdapter extends RecyclerView.Adapter<ShimlaAdapter.MyShimlaViewHolder> {
    private ArrayList<CityModel> shimlaData;
    public class MyShimlaViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyShimlaViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public ShimlaAdapter(ArrayList<CityModel> data){
        this.shimlaData = data;
    }
    @NonNull
    @Override
    public ShimlaAdapter.MyShimlaViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyShimlaViewHolder myShimlaViewHolder  = new MyShimlaViewHolder(view);
        return myShimlaViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull ShimlaAdapter.MyShimlaViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(shimlaData.get(listPosition).getName());
        textViewVersion.setText(shimlaData.get(listPosition).getVersion());
        imageView.setImageResource(shimlaData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return shimlaData.size();
    }


}
