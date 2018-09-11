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

public class AjmerAdapter extends RecyclerView.Adapter<AjmerAdapter.MyAjmerViewHolder> {
    private ArrayList<CityModel> ajmerData;

    public class MyAjmerViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyAjmerViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public AjmerAdapter(ArrayList<CityModel> data){
        this.ajmerData = data;
    }
    @NonNull
    @Override
    public AjmerAdapter.MyAjmerViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyAjmerViewHolder myAjmerViewHolder = new MyAjmerViewHolder(view);
        return myAjmerViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull AjmerAdapter.MyAjmerViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(ajmerData.get(listPosition).getName());
        textViewVersion.setText(ajmerData.get(listPosition).getVersion());
        imageView.setImageResource(ajmerData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return ajmerData.size();
    }


}
