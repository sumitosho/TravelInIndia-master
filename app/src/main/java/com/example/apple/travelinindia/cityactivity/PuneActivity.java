package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.PortAdapter;
import com.example.apple.travelinindia.cityadapter.PuneAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.PondicherryData;
import com.example.apple.travelinindia.mydata.PuneData;

import java.util.ArrayList;

public class PuneActivity extends AppCompatActivity {
    private PuneAdapter puneAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView pune_recyclerview;
    private static ArrayList<CityModel> punedata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pune);
        pune_recyclerview = findViewById(R.id.pune_recycler_view);
        pune_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        pune_recyclerview.setLayoutManager(linearLayout);


        punedata = new ArrayList<CityModel>();
        for (int i = 0; i < PuneData.nameArray.length; i++) {
            punedata.add(new CityModel(
                    PuneData.nameArray[i],
                    PuneData.versionArray[i],
                    PuneData.id_[i],
                    PuneData.drawableArray[i]
            ));
        }

        puneAdapter = new PuneAdapter(punedata);
        pune_recyclerview.setAdapter(puneAdapter);
    }
}
