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

public class JaipurAdapter extends RecyclerView.Adapter<JaipurAdapter.MyJaipurViewHolder>{
    private ArrayList<CityModel> jaipurData;

    public class  MyJaipurViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyJaipurViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public JaipurAdapter(ArrayList<CityModel> data){
        this.jaipurData = data;
    }
    @NonNull
    @Override
    public JaipurAdapter.MyJaipurViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

       MyJaipurViewHolder myJaipurViewHolder = new MyJaipurViewHolder(view);
        return myJaipurViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull JaipurAdapter.MyJaipurViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(jaipurData.get(listPosition).getName());
        textViewVersion.setText(jaipurData.get(listPosition).getVersion());
        imageView.setImageResource(jaipurData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return jaipurData.size();
    }



}
