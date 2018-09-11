package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.ThiruAdapter;
import com.example.apple.travelinindia.cityadapter.UdaipurAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.ThiruData;
import com.example.apple.travelinindia.mydata.UdaipurData;

import java.util.ArrayList;

public class UdaipurActivity extends AppCompatActivity {
    private UdaipurAdapter udaipurAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView udaipur_recyclerview;
    private static ArrayList<CityModel> udaipurdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udaipur);
        udaipur_recyclerview = findViewById(R.id.udaipur_recycler_view);
        udaipur_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        udaipur_recyclerview.setLayoutManager(linearLayout);


        udaipurdata = new ArrayList<CityModel>();
        for (int i = 0; i < UdaipurData.nameArray.length; i++) {
            udaipurdata.add(new CityModel(
                    UdaipurData.nameArray[i],
                    UdaipurData.versionArray[i],
                    UdaipurData.id_[i],
                    UdaipurData.drawableArray[i]
            ));
        }

        udaipurAdapter = new UdaipurAdapter(udaipurdata);
        udaipur_recyclerview.setAdapter(udaipurAdapter);
    }
}
