package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AlappuzhaAdapter;
import com.example.apple.travelinindia.cityadapter.AmritsarAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AlappuzhaData;
import com.example.apple.travelinindia.mydata.AmirtsarData;

import java.util.ArrayList;

public class Amritsar extends AppCompatActivity {

    private AmritsarAdapter amritsarAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView amritsar_recyclerview;
    private static ArrayList<CityModel> amirtsardata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amritsar);
        amritsar_recyclerview = findViewById(R.id.amritsar_recycler_view);
        amritsar_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        amritsar_recyclerview.setLayoutManager(linearLayout);


        amirtsardata = new ArrayList<CityModel>();
        for (int i = 0; i < AmirtsarData.nameArray.length; i++) {
            amirtsardata.add(new CityModel(
                    AmirtsarData.nameArray[i],
                    AmirtsarData.versionArray[i],
                    AmirtsarData.id_[i],
                    AmirtsarData.drawableArray[i]
            ));
        }

        amritsarAdapter = new AmritsarAdapter(amirtsardata);
        amritsar_recyclerview.setAdapter(amritsarAdapter);
    }

}
