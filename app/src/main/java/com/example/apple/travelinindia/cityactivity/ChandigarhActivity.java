package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.BikanerAdapter;
import com.example.apple.travelinindia.cityadapter.ChandigarhAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.BikanerData;
import com.example.apple.travelinindia.mydata.ChandigarhData;

import java.util.ArrayList;

public class ChandigarhActivity extends AppCompatActivity {
    private ChandigarhAdapter chandigarhAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView chandigarh_recyclerview;
    private static ArrayList<CityModel> chandigarhdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chandigarh);
        chandigarh_recyclerview = findViewById(R.id.chandigarh_recycler_view);
        chandigarh_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        chandigarh_recyclerview.setLayoutManager(linearLayout);


        chandigarhdata = new ArrayList<CityModel>();
        for (int i = 0; i < ChandigarhData.nameArray.length; i++) {
            chandigarhdata.add(new CityModel(
                    ChandigarhData.nameArray[i],
                    ChandigarhData.versionArray[i],
                    ChandigarhData.id_[i],
                    ChandigarhData.drawableArray[i]
            ));
        }

        chandigarhAdapter = new ChandigarhAdapter(chandigarhdata);
        chandigarh_recyclerview.setAdapter(chandigarhAdapter);

    }

}
