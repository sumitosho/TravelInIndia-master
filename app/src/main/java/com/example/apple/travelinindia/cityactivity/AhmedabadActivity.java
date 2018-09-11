package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AgraAdapter;
import com.example.apple.travelinindia.cityadapter.AhmedaAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AgraData;
import com.example.apple.travelinindia.mydata.AhmedaData;

import java.util.ArrayList;

public class AhmedabadActivity extends AppCompatActivity {
    private AhmedaAdapter ahmedaAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView ahmedabad_recyclerview;
    private static ArrayList<CityModel> ahmedabaddata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedabad);
        ahmedabad_recyclerview = findViewById(R.id.ahmedabad_recycler_view);
        ahmedabad_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
       ahmedabad_recyclerview.setLayoutManager(linearLayout);


        ahmedabaddata = new ArrayList<CityModel>();
        for (int i = 0; i < AhmedaData.nameArray.length; i++) {
            ahmedabaddata.add(new CityModel(
                    AhmedaData.nameArray[i],
                    AhmedaData.versionArray[i],
                    AhmedaData.id_[i],
                    AhmedaData.drawableArray[i]
            ));
        }

        ahmedaAdapter = new AhmedaAdapter(ahmedabaddata);
        ahmedabad_recyclerview.setAdapter(ahmedaAdapter);
    }
}
