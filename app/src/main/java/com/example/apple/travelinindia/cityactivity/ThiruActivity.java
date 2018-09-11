package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.ShimlaAdapter;
import com.example.apple.travelinindia.cityadapter.ThiruAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.ShimlaData;
import com.example.apple.travelinindia.mydata.ThiruData;

import java.util.ArrayList;

public class ThiruActivity extends AppCompatActivity {
    private ThiruAdapter thiruAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView thiru_recyclerview;
    private static ArrayList<CityModel> thiruhdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thiru);
        thiru_recyclerview = findViewById(R.id.thiru_recycler_view);
        thiru_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        thiru_recyclerview.setLayoutManager(linearLayout);


        thiruhdata = new ArrayList<CityModel>();
        for (int i = 0; i < ThiruData.nameArray.length; i++) {
            thiruhdata.add(new CityModel(
                    ThiruData.nameArray[i],
                    ThiruData.versionArray[i],
                    ThiruData.id_[i],
                    ThiruData.drawableArray[i]
            ));
        }

        thiruAdapter = new ThiruAdapter(thiruhdata);
        thiru_recyclerview.setAdapter(thiruAdapter);
    }
}
