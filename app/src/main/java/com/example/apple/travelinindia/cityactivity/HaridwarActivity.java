package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.HampiAdapter;
import com.example.apple.travelinindia.cityadapter.HaridwarAdpter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.HampiData;
import com.example.apple.travelinindia.mydata.HaridwarData;

import java.util.ArrayList;

public class HaridwarActivity extends AppCompatActivity {
    private HaridwarAdpter haridwarAdpter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView haridwar_recyclerview;
    private static ArrayList<CityModel> haridwardata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haridwar);
        haridwar_recyclerview = findViewById(R.id.haridwar_recycler_view);
        haridwar_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        haridwar_recyclerview.setLayoutManager(linearLayout);


        haridwardata = new ArrayList<CityModel>();
        for (int i = 0; i < HaridwarData.nameArray.length; i++) {
            haridwardata.add(new CityModel(
                    HaridwarData.nameArray[i],
                    HaridwarData.versionArray[i],
                    HaridwarData.id_[i],
                    HaridwarData.drawableArray[i]
            ));
        }

        haridwarAdpter = new HaridwarAdpter(haridwardata);
        haridwar_recyclerview.setAdapter(haridwarAdpter);
    }
}
