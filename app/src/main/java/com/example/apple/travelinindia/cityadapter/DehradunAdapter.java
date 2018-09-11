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

public class DehradunAdapter extends RecyclerView.Adapter<DehradunAdapter.MyDehraViewHolder>{

    private ArrayList<CityModel> dehradunData;
    public class MyDehraViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyDehraViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }
    public DehradunAdapter(ArrayList<CityModel> data){
        this.dehradunData = data;
    }
    @NonNull
    @Override
    public DehradunAdapter.MyDehraViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyDehraViewHolder myDehraViewHolder = new MyDehraViewHolder(view);
        return myDehraViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull DehradunAdapter.MyDehraViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dehradunData.get(listPosition).getName());
        textViewVersion.setText(dehradunData.get(listPosition).getVersion());
        imageView.setImageResource(dehradunData.get(listPosition).getImage());


    }

    @Override
    public int getItemCount() {
        return dehradunData.size();
    }


}
