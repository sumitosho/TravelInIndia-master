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

public class JaisalmerAdapter extends RecyclerView.Adapter<JaisalmerAdapter.MyJaisalViewHolder> {
    private ArrayList<CityModel> jaisalmerData;
    public class MyJaisalViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewVersion;
        ImageView imageViewIcon;
        public MyJaisalViewHolder( View itemView ) {
            super(itemView);
            this.textViewName =  itemView.findViewById(R.id.textViewName);
            this.textViewVersion =  itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon =  itemView.findViewById(R.id.imageView);
        }
    }

    public JaisalmerAdapter(ArrayList<CityModel> data){
        this.jaisalmerData = data;
    }
    @NonNull
    @Override
    public JaisalmerAdapter.MyJaisalViewHolder onCreateViewHolder( @NonNull ViewGroup parent, int viewType ) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cards_layout, parent, false);

        MyJaisalViewHolder myJaisalViewHolder = new MyJaisalViewHolder(view);
        return myJaisalViewHolder;
    }

    @Override
    public void onBindViewHolder( @NonNull JaisalmerAdapter.MyJaisalViewHolder holder, int listPosition ) {
        TextView textViewName = holder.textViewName;
        TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(jaisalmerData.get(listPosition).getName());
        textViewVersion.setText(jaisalmerData.get(listPosition).getVersion());
        imageView.setImageResource(jaisalmerData.get(listPosition).getImage());

    }

    @Override
    public int getItemCount() {
        return jaisalmerData.size();
    }


}
