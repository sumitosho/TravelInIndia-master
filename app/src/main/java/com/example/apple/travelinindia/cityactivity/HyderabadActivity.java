package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.HimachalAdapter;
import com.example.apple.travelinindia.cityadapter.HyderAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.HimachalData;
import com.example.apple.travelinindia.mydata.HyderaData;

import java.util.ArrayList;

public class HyderabadActivity extends AppCompatActivity {

    private HyderAdapter hyderAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView hyderabad_recyclerview;
    private static ArrayList<CityModel> hyderdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad);
        hyderabad_recyclerview = findViewById(R.id.hyderabad_recycler_view);
        hyderabad_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        hyderabad_recyclerview.setLayoutManager(linearLayout);


        hyderdata = new ArrayList<CityModel>();
        for (int i = 0; i < HyderaData.nameArray.length; i++) {
            hyderdata.add(new CityModel(
                    HyderaData.nameArray[i],
                    HyderaData.versionArray[i],
                    HyderaData.id_[i],
                    HyderaData.drawableArray[i]
            ));
        }

        hyderAdapter = new HyderAdapter(hyderdata);
        hyderabad_recyclerview.setAdapter(hyderAdapter);
    }
}
