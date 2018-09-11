package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.MumbaiAdapter;
import com.example.apple.travelinindia.cityadapter.MunnarAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.MumbaiData;
import com.example.apple.travelinindia.mydata.MunnarData;

import java.util.ArrayList;

public class MunnarActivity extends AppCompatActivity {
    private MunnarAdapter munnarAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView munnar_recyclerview;
    private static ArrayList<CityModel> munnardata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_munnar);
        munnar_recyclerview = findViewById(R.id.munnar_recycler_view);
        munnar_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        munnar_recyclerview.setLayoutManager(linearLayout);


        munnardata = new ArrayList<CityModel>();
        for (int i = 0; i < MunnarData.nameArray.length; i++) {
            munnardata.add(new CityModel(
                    MunnarData.nameArray[i],
                    MunnarData.versionArray[i],
                    MunnarData.id_[i],
                    MunnarData.drawableArray[i]
            ));
        }

        munnarAdapter = new MunnarAdapter(munnardata);
        munnar_recyclerview.setAdapter(munnarAdapter);
    }
}
