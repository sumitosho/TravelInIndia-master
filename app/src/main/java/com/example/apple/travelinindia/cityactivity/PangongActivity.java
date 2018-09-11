package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.NainitalAdapter;
import com.example.apple.travelinindia.cityadapter.PangongAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.NainitalData;
import com.example.apple.travelinindia.mydata.PangongData;

import java.util.ArrayList;

public class PangongActivity extends AppCompatActivity {
    private PangongAdapter pangongAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView pangong_recyclerview;
    private static ArrayList<CityModel> pangongdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pangong);
        pangong_recyclerview = findViewById(R.id.pangong_recycler_view);
        pangong_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        pangong_recyclerview.setLayoutManager(linearLayout);


        pangongdata = new ArrayList<CityModel>();
        for (int i = 0; i < PangongData.nameArray.length; i++) {
            pangongdata.add(new CityModel(
                    PangongData.nameArray[i],
                    PangongData.versionArray[i],
                    PangongData.id_[i],
                    PangongData.drawableArray[i]
            ));
        }

        pangongAdapter = new PangongAdapter(pangongdata);
        pangong_recyclerview.setAdapter(pangongAdapter);
    }
}
