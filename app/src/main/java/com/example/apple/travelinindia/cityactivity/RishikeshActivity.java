package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.PushkarAdapter;
import com.example.apple.travelinindia.cityadapter.RishikeshAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.PushkarData;
import com.example.apple.travelinindia.mydata.RishikeshData;

import java.util.ArrayList;

public class RishikeshActivity extends AppCompatActivity {
    private RishikeshAdapter rishikeshAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView rishikesh_recyclerview;
    private static ArrayList<CityModel> rishikeshdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rishikesh);
        rishikesh_recyclerview = findViewById(R.id.rishikesh_recycler_view);
        rishikesh_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        rishikesh_recyclerview.setLayoutManager(linearLayout);


        rishikeshdata = new ArrayList<CityModel>();
        for (int i = 0; i < RishikeshData.nameArray.length; i++) {
            rishikeshdata.add(new CityModel(
                    RishikeshData.nameArray[i],
                    RishikeshData.versionArray[i],
                    RishikeshData.id_[i],
                    RishikeshData.drawableArray[i]
            ));
        }

        rishikeshAdapter = new RishikeshAdapter(rishikeshdata);
        rishikesh_recyclerview.setAdapter(rishikeshAdapter);
    }
}
