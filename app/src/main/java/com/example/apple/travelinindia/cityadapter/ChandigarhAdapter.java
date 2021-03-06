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

public class ChandigarhAdapter extends RecyclerView.Adapter<ChandigarhAdapter.MyChandiViewHolder> {
    private ArrayList<CityModel> chandigarhData;
    public class MyChandiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyChandiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public ChandigarhAdapter(ArrayList<CityModel> data) {
        this.chandigarhData = data;
    }
    @NonNull
    @Override
    public ChandigarhAdapter.MyChandiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyChandiViewHolder myChandiViewHolder = new MyChandiViewHolder(view);
        return myChandiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull ChandigarhAdapter.MyChandiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(chandigarhData.get(listPosition).getName());
        textViewVersion.setText(chandigarhData.get(listPosition).getVersion());
        imageView.setImageResource(chandigarhData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return chandigarhData.size();
    }


}
