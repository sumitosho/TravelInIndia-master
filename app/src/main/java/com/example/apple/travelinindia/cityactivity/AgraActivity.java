package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AgraAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.datamodel.DataModelTravel;
import com.example.apple.travelinindia.mydata.AgraData;
import com.example.apple.travelinindia.mydata.TravelData;
import com.example.apple.travelinindia.traveldata.TravelAdapter;

import java.util.ArrayList;

public class AgraActivity extends AppCompatActivity {
    private AgraAdapter agraAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView agra_recyclerview;
    private static ArrayList<CityModel> agradata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agra);
        agra_recyclerview = findViewById(R.id.agra_recycler_view);
        agra_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        agra_recyclerview.setLayoutManager(linearLayout);


        agradata = new ArrayList<CityModel>();
        for (int i = 0; i < AgraData.nameArray.length; i++) {
            agradata.add(new CityModel(
                    AgraData.nameArray[i],
                    AgraData.versionArray[i],
                    AgraData.id_[i],
                    AgraData.drawableArray[i]
            ));
        }

        agraAdapter = new AgraAdapter(agradata);
        agra_recyclerview.setAdapter(agraAdapter);

    }
}
