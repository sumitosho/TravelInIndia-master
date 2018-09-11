package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.KochiAdapter;
import com.example.apple.travelinindia.cityadapter.KodaikaAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.JodhpurData;
import com.example.apple.travelinindia.mydata.KodaikData;

import java.util.ArrayList;

public class KodaikanalActivity extends AppCompatActivity {
    private KodaikaAdapter kodaikaAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView kodaikanal_recyclerview;
    private static ArrayList<CityModel> kodaikanaldata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kodaikanal);
        kodaikanal_recyclerview = findViewById(R.id.kodaikanal_recycler_view);
        kodaikanal_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        kodaikanal_recyclerview.setLayoutManager(linearLayout);


        kodaikanaldata = new ArrayList<CityModel>();
        for (int i = 0; i < KodaikData.nameArray.length; i++) {
            kodaikanaldata.add(new CityModel(
                    KodaikData.nameArray[i],
                    KodaikData.versionArray[i],
                    KodaikData.id_[i],
                    KodaikData.drawableArray[i]
            ));
        }

        kodaikaAdapter = new KodaikaAdapter(kodaikanaldata);
        kodaikanal_recyclerview.setAdapter(kodaikaAdapter);
    }
}
