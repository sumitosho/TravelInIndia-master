package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.HaridwarAdpter;
import com.example.apple.travelinindia.cityadapter.HimachalAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.HaridwarData;
import com.example.apple.travelinindia.mydata.HimachalData;

import java.util.ArrayList;

public class HimachalActivity extends AppCompatActivity {
    private HimachalAdapter himachalAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView himachal_recyclerview;
    private static ArrayList<CityModel> himachaldata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal);
        himachal_recyclerview = findViewById(R.id.himachal_recycler_view);
        himachal_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        himachal_recyclerview.setLayoutManager(linearLayout);


        himachaldata = new ArrayList<CityModel>();
        for (int i = 0; i < HimachalData.nameArray.length; i++) {
            himachaldata.add(new CityModel(
                    HimachalData.nameArray[i],
                    HimachalData.versionArray[i],
                    HimachalData.id_[i],
                    HimachalData.drawableArray[i]
            ));
        }

        himachalAdapter = new HimachalAdapter(himachaldata);
        himachal_recyclerview.setAdapter(himachalAdapter);
    }
}
