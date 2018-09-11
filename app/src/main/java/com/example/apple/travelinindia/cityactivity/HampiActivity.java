package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.GoaAdapter;
import com.example.apple.travelinindia.cityadapter.HampiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.GoaData;
import com.example.apple.travelinindia.mydata.HampiData;

import java.util.ArrayList;

public class HampiActivity extends AppCompatActivity {

    private HampiAdapter hampiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView hampi_recyclerview;
    private static ArrayList<CityModel> hampidata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hampi);
        hampi_recyclerview = findViewById(R.id.hampi_recycler_view);
        hampi_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        hampi_recyclerview.setLayoutManager(linearLayout);


        hampidata = new ArrayList<CityModel>();
        for (int i = 0; i < HampiData.nameArray.length; i++) {
            hampidata.add(new CityModel(
                    HampiData.nameArray[i],
                    HampiData.versionArray[i],
                    HampiData.id_[i],
                    HampiData.drawableArray[i]
            ));
        }

        hampiAdapter = new HampiAdapter(hampidata);
        hampi_recyclerview.setAdapter(hampiAdapter);
    }

}
