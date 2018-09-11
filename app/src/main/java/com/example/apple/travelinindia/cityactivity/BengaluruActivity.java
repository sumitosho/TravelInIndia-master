package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AurangaAdapter;
import com.example.apple.travelinindia.cityadapter.BengaluruAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AurangaData;
import com.example.apple.travelinindia.mydata.BengaluruData;

import java.util.ArrayList;

public class BengaluruActivity extends AppCompatActivity {
    private BengaluruAdapter bengaluruAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView bengaluru_recyclerview;
    private static ArrayList<CityModel> bengalurudata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bengaluru);
        bengaluru_recyclerview = findViewById(R.id.bengaluru_recycler_view);
        bengaluru_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        bengaluru_recyclerview.setLayoutManager(linearLayout);


        bengalurudata = new ArrayList<CityModel>();
        for (int i = 0; i < BengaluruData.nameArray.length; i++) {
            bengalurudata.add(new CityModel(
                    BengaluruData.nameArray[i],
                    BengaluruData.versionArray[i],
                    BengaluruData.id_[i],
                    BengaluruData.drawableArray[i]
            ));
        }

        bengaluruAdapter = new BengaluruAdapter(bengalurudata);
        bengaluru_recyclerview.setAdapter(bengaluruAdapter);

    }

}
