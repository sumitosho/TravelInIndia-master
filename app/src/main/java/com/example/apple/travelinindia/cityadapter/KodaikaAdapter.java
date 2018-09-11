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

public class KodaikaAdapter extends RecyclerView.Adapter<KodaikaAdapter.MyKodaiViewHolder>{
    private ArrayList<CityModel> kodaikaData;
    public class MyKodaiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyKodaiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public KodaikaAdapter(ArrayList<CityModel> data){
        this.kodaikaData =data;
    }
    @NonNull
    @Override
    public KodaikaAdapter.MyKodaiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyKodaiViewHolder myKodaiViewHolder= new MyKodaiViewHolder(view);
        return myKodaiViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull KodaikaAdapter.MyKodaiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(kodaikaData.get(listPosition).getName());
        textViewVersion.setText(kodaikaData.get(listPosition).getVersion());
        imageView.setImageResource(kodaikaData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return kodaikaData.size();
    }


}
