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

public class BikanerAdapter extends RecyclerView.Adapter<BikanerAdapter.MyBikanerViewHolder> {
    private ArrayList<CityModel> bikanerData;
    public class MyBikanerViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyBikanerViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public BikanerAdapter(ArrayList<CityModel> data){
        this.bikanerData = data;
    }
    @NonNull
    @Override
    public BikanerAdapter.MyBikanerViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyBikanerViewHolder myBikanerViewHolder = new MyBikanerViewHolder(view);
        return myBikanerViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull BikanerAdapter.MyBikanerViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(bikanerData.get(listPosition).getName());
        textViewVersion.setText(bikanerData.get(listPosition).getVersion());
        imageView.setImageResource(bikanerData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return bikanerData.size();
    }


}
