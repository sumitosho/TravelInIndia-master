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

public class GangtokAdapter extends RecyclerView.Adapter<GangtokAdapter.MyGangoViewHolder>{
    private ArrayList<CityModel> gangtokData;
    public class MyGangoViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;

        public MyGangoViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public GangtokAdapter(ArrayList<CityModel> data) {
        this.gangtokData = data;
    }
    @NonNull
    @Override
    public GangtokAdapter.MyGangoViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyGangoViewHolder myGangoViewHolder= new MyGangoViewHolder(view);
        return myGangoViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull GangtokAdapter.MyGangoViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(gangtokData.get(listPosition).getName());
        textViewVersion.setText(gangtokData.get(listPosition).getVersion());
        imageView.setImageResource(gangtokData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return gangtokData.size();
    }


}
