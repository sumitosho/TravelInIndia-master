package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.MysoreAdapter;
import com.example.apple.travelinindia.cityadapter.NainitalAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.MysoreData;
import com.example.apple.travelinindia.mydata.NainitalData;

import java.util.ArrayList;

public class NainitalActivity extends AppCompatActivity {
    private NainitalAdapter nainitalAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView nainital_recyclerview;
    private static ArrayList<CityModel> nainitaldata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nainital);
        nainital_recyclerview = findViewById(R.id.nainital_recycler_view);
        nainital_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        nainital_recyclerview.setLayoutManager(linearLayout);


        nainitaldata = new ArrayList<CityModel>();
        for (int i = 0; i < NainitalData.nameArray.length; i++) {
            nainitaldata.add(new CityModel(
                    NainitalData.nameArray[i],
                    NainitalData.versionArray[i],
                    NainitalData.id_[i],
                    NainitalData.drawableArray[i]
            ));
        }

        nainitalAdapter = new NainitalAdapter(nainitaldata);
        nainital_recyclerview.setAdapter(nainitalAdapter);
    }
}
