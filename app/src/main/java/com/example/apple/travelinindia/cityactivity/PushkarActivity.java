package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.PuneAdapter;
import com.example.apple.travelinindia.cityadapter.PushkarAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.PuneData;
import com.example.apple.travelinindia.mydata.PushkarData;

import java.util.ArrayList;

public class PushkarActivity extends AppCompatActivity {
    private PushkarAdapter pushkarAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView pushkar_recyclerview;
    private static ArrayList<CityModel> pushkardata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pushkar);
        pushkar_recyclerview = findViewById(R.id.pushkar_recycler_view);
        pushkar_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        pushkar_recyclerview.setLayoutManager(linearLayout);


        pushkardata = new ArrayList<CityModel>();
        for (int i = 0; i < PushkarData.nameArray.length; i++) {
            pushkardata.add(new CityModel(
                    PushkarData.nameArray[i],
                    PushkarData.versionArray[i],
                    PushkarData.id_[i],
                    PushkarData.drawableArray[i]
            ));
        }

        pushkarAdapter = new PushkarAdapter(pushkardata);
        pushkar_recyclerview.setAdapter(pushkarAdapter);

    }
}
