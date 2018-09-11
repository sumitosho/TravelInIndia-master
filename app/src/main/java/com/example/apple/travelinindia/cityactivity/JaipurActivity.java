package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AgraAdapter;
import com.example.apple.travelinindia.cityadapter.JaipurAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AgraData;
import com.example.apple.travelinindia.mydata.JaipurData;

import java.util.ArrayList;

public class JaipurActivity extends AppCompatActivity {
    private  JaipurAdapter jaipurAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView jaipur_recyclerview;
    private static ArrayList<CityModel> jaipurdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaipur);
        jaipur_recyclerview = findViewById(R.id.jaipur_recycler_view);
        jaipur_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        jaipur_recyclerview.setLayoutManager(linearLayout);


        jaipurdata = new ArrayList<CityModel>();
        for (int i = 0; i < JaipurData.nameArray.length; i++) {
            jaipurdata.add(new CityModel(
                    JaipurData.nameArray[i],
                    JaipurData.versionArray[i],
                    JaipurData.id_[i],
                    JaipurData.drawableArray[i]
            ));
        }

        jaipurAdapter = new JaipurAdapter(jaipurdata);
        jaipur_recyclerview.setAdapter(jaipurAdapter);
    }
}
