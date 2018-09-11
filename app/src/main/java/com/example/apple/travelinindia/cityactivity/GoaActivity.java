package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.GangtokAdapter;
import com.example.apple.travelinindia.cityadapter.GoaAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.GangtokData;
import com.example.apple.travelinindia.mydata.GoaData;

import java.util.ArrayList;

public class GoaActivity extends AppCompatActivity {
    private GoaAdapter goaAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView goa_recyclerview;
    private static ArrayList<CityModel> goadata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);
        goa_recyclerview = findViewById(R.id.goa_recycler_view);
        goa_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        goa_recyclerview.setLayoutManager(linearLayout);


        goadata = new ArrayList<CityModel>();
        for (int i = 0; i < GoaData.nameArray.length; i++) {
            goadata.add(new CityModel(
                    GoaData.nameArray[i],
                    GoaData.versionArray[i],
                    GoaData.id_[i],
                    GoaData.drawableArray[i]
            ));
        }

        goaAdapter = new GoaAdapter(goadata);
        goa_recyclerview.setAdapter(goaAdapter);
    }
}
