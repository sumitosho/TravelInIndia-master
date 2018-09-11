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

public class KovalamAdapter extends RecyclerView.Adapter<KovalamAdapter.MyKovalViewHolder> {
    private ArrayList<CityModel> kovalamData;
    public class MyKovalViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyKovalViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public KovalamAdapter(ArrayList<CityModel> data){
        this.kovalamData = data;
    }
    @NonNull
    @Override
    public KovalamAdapter.MyKovalViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyKovalViewHolder myKovalViewHolder= new MyKovalViewHolder(view);
        return myKovalViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull KovalamAdapter.MyKovalViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(kovalamData.get(listPosition).getName());
        textViewVersion.setText(kovalamData.get(listPosition).getVersion());
        imageView.setImageResource(kovalamData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return kovalamData.size();
    }


}
