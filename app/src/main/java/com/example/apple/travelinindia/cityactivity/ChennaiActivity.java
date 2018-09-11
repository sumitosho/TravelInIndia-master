package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.ChandigarhAdapter;
import com.example.apple.travelinindia.cityadapter.ChennaiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.ChandigarhData;
import com.example.apple.travelinindia.mydata.ChennaiData;

import java.util.ArrayList;

public class ChennaiActivity extends AppCompatActivity {

    private ChennaiAdapter chennaiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView chennai_recyclerview;
    private static ArrayList<CityModel> chennaidata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chennai);
        chennai_recyclerview = findViewById(R.id.chennai_recycler_view);
        chennai_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        chennai_recyclerview.setLayoutManager(linearLayout);


        chennaidata = new ArrayList<CityModel>();
        for (int i = 0; i < ChennaiData.nameArray.length; i++) {
            chennaidata.add(new CityModel(
                    ChennaiData.nameArray[i],
                    ChennaiData.versionArray[i],
                    ChennaiData.id_[i],
                    ChennaiData.drawableArray[i]
            ));
        }

        chennaiAdapter = new ChennaiAdapter(chennaidata);
        chennai_recyclerview.setAdapter(chennaiAdapter);


    }
}
