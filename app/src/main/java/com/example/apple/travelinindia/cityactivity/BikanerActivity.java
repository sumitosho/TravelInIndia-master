package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.BengaluruAdapter;
import com.example.apple.travelinindia.cityadapter.BikanerAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.BengaluruData;
import com.example.apple.travelinindia.mydata.BikanerData;

import java.util.ArrayList;

public class BikanerActivity extends AppCompatActivity {
    private BikanerAdapter bikanerAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView bikaner_recyclerview;
    private static ArrayList<CityModel> bikanerdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bikaner);
        bikaner_recyclerview = findViewById(R.id.bikaner_recycler_view);
        bikaner_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        bikaner_recyclerview.setLayoutManager(linearLayout);


        bikanerdata = new ArrayList<CityModel>();
        for (int i = 0; i < BikanerData.nameArray.length; i++) {
            bikanerdata.add(new CityModel(
                    BikanerData.nameArray[i],
                    BikanerData.versionArray[i],
                    BikanerData.id_[i],
                    BikanerData.drawableArray[i]
            ));
        }

        bikanerAdapter = new BikanerAdapter(bikanerdata);
        bikaner_recyclerview.setAdapter(bikanerAdapter);

    }

}
