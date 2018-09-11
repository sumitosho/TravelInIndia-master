package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.MamallAdapter;
import com.example.apple.travelinindia.cityadapter.MumbaiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.MamallData;
import com.example.apple.travelinindia.mydata.MumbaiData;

import java.util.ArrayList;

public class MumbaiActivity extends AppCompatActivity {
    private MumbaiAdapter mumbaiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView mumbai_recyclerview;
    private static ArrayList<CityModel> mumbaidata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumbai);
        mumbai_recyclerview = findViewById(R.id.mumbai_recycler_view);
        mumbai_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        mumbai_recyclerview.setLayoutManager(linearLayout);


        mumbaidata = new ArrayList<CityModel>();
        for (int i = 0; i < MumbaiData.nameArray.length; i++) {
            mumbaidata.add(new CityModel(
                    MumbaiData.nameArray[i],
                    MumbaiData.versionArray[i],
                    MumbaiData.id_[i],
                    MumbaiData.drawableArray[i]
            ));
        }

        mumbaiAdapter = new MumbaiAdapter(mumbaidata);
        mumbai_recyclerview.setAdapter(mumbaiAdapter);
    }
}
