package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.FatehpurAdapter;
import com.example.apple.travelinindia.cityadapter.GangtokAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.FatehpurData;
import com.example.apple.travelinindia.mydata.GangtokData;

import java.util.ArrayList;

public class GangtokActivity extends AppCompatActivity {
    private GangtokAdapter gangtokAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView gangtok_recyclerview;
    private static ArrayList<CityModel> gangtokdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangtok);
        gangtok_recyclerview = findViewById(R.id.gangtok_recycler_view);
        gangtok_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        gangtok_recyclerview.setLayoutManager(linearLayout);


        gangtokdata = new ArrayList<CityModel>();
        for (int i = 0; i < GangtokData.nameArray.length; i++) {
            gangtokdata.add(new CityModel(
                    GangtokData.nameArray[i],
                    GangtokData.versionArray[i],
                    GangtokData.id_[i],
                    GangtokData.drawableArray[i]
            ));
        }

        gangtokAdapter = new GangtokAdapter(gangtokdata);
        gangtok_recyclerview.setAdapter(gangtokAdapter);
    }
}
