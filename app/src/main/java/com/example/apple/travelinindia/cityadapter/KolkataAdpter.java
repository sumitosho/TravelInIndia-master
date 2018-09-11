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

public class KolkataAdpter extends RecyclerView.Adapter<KolkataAdpter.MyKolkataViewHolder>{
    private ArrayList<CityModel> kolkataData;
    public class MyKolkataViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyKolkataViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public KolkataAdpter(ArrayList<CityModel> data) {
        this.kolkataData = data;
    }
    @NonNull
    @Override
    public KolkataAdpter.MyKolkataViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyKolkataViewHolder myKolkataViewHolder= new MyKolkataViewHolder(view);
        return myKolkataViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull KolkataAdpter.MyKolkataViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(kolkataData.get(listPosition).getName());
        textViewVersion.setText(kolkataData.get(listPosition).getVersion());
        imageView.setImageResource(kolkataData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return kolkataData.size();
    }


}
