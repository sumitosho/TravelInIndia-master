package com.example.apple.travelinindia.cityadapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityactivity.Pondicherry;
import com.example.apple.travelinindia.datamodel.CityModel;

import java.util.ArrayList;

public class PondicherryAdapter extends RecyclerView.Adapter<PondicherryAdapter.MyPondiViewHolder> {
    private ArrayList<CityModel> pondicherryData;
    public class MyPondiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyPondiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public PondicherryAdapter(ArrayList<CityModel> data){
        this.pondicherryData = data;
    }
    @NonNull
    @Override
    public PondicherryAdapter.MyPondiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyPondiViewHolder myPondiViewHolder  = new MyPondiViewHolder(view);
        return myPondiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull PondicherryAdapter.MyPondiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(pondicherryData.get(listPosition).getName());
        textViewVersion.setText(pondicherryData.get(listPosition).getVersion());
        imageView.setImageResource(pondicherryData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return pondicherryData.size();
    }


}
