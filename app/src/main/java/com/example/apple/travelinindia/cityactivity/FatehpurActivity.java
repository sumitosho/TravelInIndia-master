package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.DharamAdapter;
import com.example.apple.travelinindia.cityadapter.FatehpurAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.DharamData;
import com.example.apple.travelinindia.mydata.FatehpurData;

import java.util.ArrayList;

public class FatehpurActivity extends AppCompatActivity {
    private FatehpurAdapter fatehpurAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView fatehpur_recyclerview;
    private static ArrayList<CityModel> fatehpurdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatehpur);
        fatehpur_recyclerview = findViewById(R.id.fatehpur_recycler_view);
        fatehpur_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        fatehpur_recyclerview.setLayoutManager(linearLayout);


        fatehpurdata = new ArrayList<CityModel>();
        for (int i = 0; i < FatehpurData.nameArray.length; i++) {
            fatehpurdata.add(new CityModel(
                    FatehpurData.nameArray[i],
                    FatehpurData.versionArray[i],
                    FatehpurData.id_[i],
                    FatehpurData.drawableArray[i]
            ));
        }

        fatehpurAdapter = new FatehpurAdapter(fatehpurdata);
        fatehpur_recyclerview.setAdapter(fatehpurAdapter);

    }
}
