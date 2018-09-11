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

public class KochiAdapter extends RecyclerView.Adapter<KochiAdapter.MyKochiViewHolder> {
    private ArrayList<CityModel> kochiData;
    public class MyKochiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyKochiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public KochiAdapter(ArrayList<CityModel> data){
        this.kochiData = data;
    }
    @NonNull
    @Override
    public KochiAdapter.MyKochiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyKochiViewHolder myKochiViewHolder= new MyKochiViewHolder(view);
        return myKochiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull KochiAdapter.MyKochiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(kochiData.get(listPosition).getName());
        textViewVersion.setText(kochiData.get(listPosition).getVersion());
        imageView.setImageResource(kochiData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return kochiData.size();
    }


}
