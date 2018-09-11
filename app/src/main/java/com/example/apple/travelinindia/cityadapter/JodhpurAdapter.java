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

public class JodhpurAdapter extends RecyclerView.Adapter<JodhpurAdapter.MyJodhaViewHolder>{
    private ArrayList<CityModel> jodhpurData;

    public class MyJodhaViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyJodhaViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public JodhpurAdapter(ArrayList<CityModel> data){
        this.jodhpurData = data;
    }

    @NonNull
    @Override
    public JodhpurAdapter.MyJodhaViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyJodhaViewHolder myJodhaViewHolder = new MyJodhaViewHolder(view);
        return myJodhaViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull JodhpurAdapter.MyJodhaViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(jodhpurData.get(listPosition).getName());
        textViewVersion.setText(jodhpurData.get(listPosition).getVersion());
        imageView.setImageResource(jodhpurData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return jodhpurData.size();
    }


}
