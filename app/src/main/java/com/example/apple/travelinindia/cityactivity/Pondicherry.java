package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.PangongAdapter;
import com.example.apple.travelinindia.cityadapter.PondicherryAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.PangongData;
import com.example.apple.travelinindia.mydata.PondicherryData;

import java.util.ArrayList;

public class Pondicherry extends AppCompatActivity {
    private PondicherryAdapter pondicherryAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView pondicherry_recyclerview;
    private static ArrayList<CityModel> pondicherrydata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pondicherry);
        pondicherry_recyclerview = findViewById(R.id.pondicherry_recycler_view);
        pondicherry_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        pondicherry_recyclerview.setLayoutManager(linearLayout);


        pondicherrydata = new ArrayList<CityModel>();
        for (int i = 0; i < PondicherryData.nameArray.length; i++) {
            pondicherrydata.add(new CityModel(
                    PondicherryData.nameArray[i],
                    PondicherryData.versionArray[i],
                    PondicherryData.id_[i],
                    PondicherryData.drawableArray[i]
            ));
        }

        pondicherryAdapter = new PondicherryAdapter(pondicherrydata);
        pondicherry_recyclerview.setAdapter(pondicherryAdapter);
    }
}
