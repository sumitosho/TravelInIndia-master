package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.KodaikaAdapter;
import com.example.apple.travelinindia.cityadapter.KolkataAdpter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.KodaikData;
import com.example.apple.travelinindia.mydata.KolkataData;

import java.util.ArrayList;

public class KolkataActivity extends AppCompatActivity {
    private KolkataAdpter kolkataAdpter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView kolkata_recyclerview;
    private static ArrayList<CityModel> kolkatadata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata);
        kolkata_recyclerview = findViewById(R.id.kolkata_recycler_view);
        kolkata_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        kolkata_recyclerview.setLayoutManager(linearLayout);


        kolkatadata = new ArrayList<CityModel>();
        for (int i = 0; i < KolkataData.nameArray.length; i++) {
            kolkatadata.add(new CityModel(
                    KolkataData.nameArray[i],
                    KolkataData.versionArray[i],
                    KolkataData.id_[i],
                    KolkataData.drawableArray[i]
            ));
        }

        kolkataAdpter = new KolkataAdpter(kolkatadata);
        kolkata_recyclerview.setAdapter(kolkataAdpter);
    }
}
