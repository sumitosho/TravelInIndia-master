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

public class VaranasiAdapter extends RecyclerView.Adapter<VaranasiAdapter.MyVaranasiViewHolder> {
    private ArrayList<CityModel> varanasiData;
    public class MyVaranasiViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyVaranasiViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public VaranasiAdapter(ArrayList<CityModel> data){
        this.varanasiData = data;
    }
    @NonNull
    @Override
    public VaranasiAdapter.MyVaranasiViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyVaranasiViewHolder myVaranasiViewHolder = new MyVaranasiViewHolder(view);
        return myVaranasiViewHolder;

    }

    @Override
    public void onBindViewHolder( @NonNull VaranasiAdapter.MyVaranasiViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(varanasiData.get(listPosition).getName());
        textViewVersion.setText(varanasiData.get(listPosition).getVersion());
        imageView.setImageResource(varanasiData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return varanasiData.size();
    }


}
