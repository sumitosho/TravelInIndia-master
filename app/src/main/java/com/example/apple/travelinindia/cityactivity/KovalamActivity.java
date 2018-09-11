package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.KolkataAdpter;
import com.example.apple.travelinindia.cityadapter.KovalamAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.KolkataData;
import com.example.apple.travelinindia.mydata.KovalamData;

import java.util.ArrayList;

public class KovalamActivity extends AppCompatActivity {
    private KovalamAdapter kovalamAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView kovalam_recyclerview;
    private static ArrayList<CityModel> kovalamdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kovalam);
        kovalam_recyclerview = findViewById(R.id.kovalam_recycler_view);
        kovalam_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        kovalam_recyclerview.setLayoutManager(linearLayout);


        kovalamdata = new ArrayList<CityModel>();
        for (int i = 0; i < KovalamData.nameArray.length; i++) {
            kovalamdata.add(new CityModel(
                    KovalamData.nameArray[i],
                    KovalamData.versionArray[i],
                    KovalamData.id_[i],
                    KovalamData.drawableArray[i]
            ));
        }

        kovalamAdapter = new KovalamAdapter(kovalamdata);
        kovalam_recyclerview.setAdapter(kovalamAdapter);
    }
}
