package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.KovalamAdapter;
import com.example.apple.travelinindia.cityadapter.MaduraiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.KovalamData;
import com.example.apple.travelinindia.mydata.MaduraiData;

import java.util.ArrayList;

public class MaduraiActivity extends AppCompatActivity {
    private MaduraiAdapter maduraiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView madurai_recyclerview;
    private static ArrayList<CityModel> maduridata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madurai);
        madurai_recyclerview = findViewById(R.id.madurai_recycler_view);
        madurai_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        madurai_recyclerview.setLayoutManager(linearLayout);


        maduridata = new ArrayList<CityModel>();
        for (int i = 0; i < MaduraiData.nameArray.length; i++) {
            maduridata.add(new CityModel(
                    MaduraiData.nameArray[i],
                    MaduraiData.versionArray[i],
                    MaduraiData.id_[i],
                    MaduraiData.drawableArray[i]
            ));
        }

        maduraiAdapter = new MaduraiAdapter(maduridata);
        madurai_recyclerview.setAdapter(maduraiAdapter);
    }
}
