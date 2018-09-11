package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.PondicherryAdapter;
import com.example.apple.travelinindia.cityadapter.PortAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.PondicherryData;
import com.example.apple.travelinindia.mydata.PortData;

import java.util.ArrayList;

public class PortblairActivity extends AppCompatActivity {
    private PortAdapter portAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView port_recyclerview;
    private static ArrayList<CityModel> portdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portblair);
        port_recyclerview = findViewById(R.id.port_recycler_view);
        port_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        port_recyclerview.setLayoutManager(linearLayout);


        portdata = new ArrayList<CityModel>();
        for (int i = 0; i < PortData.nameArray.length; i++) {
            portdata.add(new CityModel(
                    PortData.nameArray[i],
                    PortData.versionArray[i],
                    PortData.id_[i],
                    PortData.drawableArray[i]
            ));
        }

        portAdapter = new PortAdapter(portdata);
        port_recyclerview.setAdapter(portAdapter);
    }
}
