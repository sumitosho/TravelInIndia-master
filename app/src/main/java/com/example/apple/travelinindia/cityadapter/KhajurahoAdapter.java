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

public class KhajurahoAdapter extends RecyclerView.Adapter<KhajurahoAdapter.MyKhajuViewHolder>{
    private ArrayList<CityModel> khajurahoData;
    public class MyKhajuViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyKhajuViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public KhajurahoAdapter(ArrayList<CityModel> data){
        this.khajurahoData =data;
    }
    @NonNull
    @Override
    public KhajurahoAdapter.MyKhajuViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyKhajuViewHolder myKhajuViewHolder = new MyKhajuViewHolder(view);
        return myKhajuViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull KhajurahoAdapter.MyKhajuViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(khajurahoData.get(listPosition).getName());
        textViewVersion.setText(khajurahoData.get(listPosition).getVersion());
        imageView.setImageResource(khajurahoData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return khajurahoData.size();
    }


}
