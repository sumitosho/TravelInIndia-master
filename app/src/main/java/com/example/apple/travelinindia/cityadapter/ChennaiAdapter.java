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

public class ChennaiAdapter extends RecyclerView.Adapter<ChennaiAdapter.MyChennaiViewHolder>{
    private ArrayList<CityModel> chennaiData;
    public class MyChennaiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyChennaiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public ChennaiAdapter(ArrayList<CityModel> data) {
        this.chennaiData = data;
    }
    @NonNull
    @Override
    public ChennaiAdapter.MyChennaiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyChennaiViewHolder myChennaiViewHolder = new MyChennaiViewHolder(view);
        return myChennaiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull ChennaiAdapter.MyChennaiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(chennaiData.get(listPosition).getName());
        textViewVersion.setText(chennaiData.get(listPosition).getVersion());
        imageView.setImageResource(chennaiData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return chennaiData.size();
    }


}
