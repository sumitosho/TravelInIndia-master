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

public class HyderAdapter extends RecyclerView.Adapter<HyderAdapter.MyHyderViewHolder>{
    private ArrayList<CityModel> hyderaData;
    public class MyHyderViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyHyderViewHolder( View itemView ) {
            super(itemView);
            this.textViewName = itemView.findViewById(R.id.textViewName);
            this.textViewVersion = itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public HyderAdapter(ArrayList<CityModel> data){
        this.hyderaData = data;
    }
    @NonNull
    @Override
    public HyderAdapter.MyHyderViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyHyderViewHolder myHyderViewHolder  = new MyHyderViewHolder(view);
        return myHyderViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull HyderAdapter.MyHyderViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(hyderaData.get(listPosition).getName());
        textViewVersion.setText(hyderaData.get(listPosition).getVersion());
        imageView.setImageResource(hyderaData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return hyderaData.size();
    }


}
