package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.MunnarAdapter;
import com.example.apple.travelinindia.cityadapter.MysoreAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.MunnarData;
import com.example.apple.travelinindia.mydata.MysoreData;

import java.util.ArrayList;

public class MysoreActivity extends AppCompatActivity {
    private MysoreAdapter mysoreAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView mysor_recyclerview;
    private static ArrayList<CityModel> mysordata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mysore);
        mysor_recyclerview = findViewById(R.id.mysor_recycler_view);
        mysor_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        mysor_recyclerview.setLayoutManager(linearLayout);


        mysordata = new ArrayList<CityModel>();
        for (int i = 0; i < MysoreData.nameArray.length; i++) {
            mysordata.add(new CityModel(
                    MysoreData.nameArray[i],
                    MysoreData.versionArray[i],
                    MysoreData.id_[i],
                    MysoreData.drawableArray[i]
            ));
        }

        mysoreAdapter = new MysoreAdapter(mysordata);
        mysor_recyclerview.setAdapter(mysoreAdapter);
    }
}
