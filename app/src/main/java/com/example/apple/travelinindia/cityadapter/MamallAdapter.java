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

public class MamallAdapter extends RecyclerView.Adapter<MamallAdapter.MyMamallViewHolder>{
    private ArrayList<CityModel> mamallData;
    public class MyMamallViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyMamallViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public MamallAdapter(ArrayList<CityModel> data){
        this.mamallData = data;
    }
    @NonNull
    @Override
    public MamallAdapter.MyMamallViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyMamallViewHolder myMamallViewHolder  = new MyMamallViewHolder(view);
        return myMamallViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull MamallAdapter.MyMamallViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(mamallData.get(listPosition).getName());
        textViewVersion.setText(mamallData.get(listPosition).getVersion());
        imageView.setImageResource(mamallData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return mamallData.size();
    }


}
