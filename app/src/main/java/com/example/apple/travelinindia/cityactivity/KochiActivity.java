package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.KhajurahoAdapter;
import com.example.apple.travelinindia.cityadapter.KochiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.JodhpurData;
import com.example.apple.travelinindia.mydata.KochiData;

import java.util.ArrayList;

public class KochiActivity extends AppCompatActivity {
    private KochiAdapter kochiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView kochi_recyclerview;
    private static ArrayList<CityModel> kochidata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kochi);
        kochi_recyclerview = findViewById(R.id.kochi_recycler_view);
        kochi_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        kochi_recyclerview.setLayoutManager(linearLayout);


        kochidata = new ArrayList<CityModel>();
        for (int i = 0; i < KochiData.nameArray.length; i++) {
            kochidata.add(new CityModel(
                    KochiData.nameArray[i],
                    KochiData.versionArray[i],
                    KochiData.id_[i],
                    KochiData.drawableArray[i]
            ));
        }

        kochiAdapter = new KochiAdapter(kochidata);
        kochi_recyclerview.setAdapter(kochiAdapter);
    }
}
