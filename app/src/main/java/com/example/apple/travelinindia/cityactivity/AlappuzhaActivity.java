package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AjmerAdapter;
import com.example.apple.travelinindia.cityadapter.AlappuzhaAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AhmedaData;
import com.example.apple.travelinindia.mydata.AlappuzhaData;

import java.util.ArrayList;

public class AlappuzhaActivity extends AppCompatActivity {
    private AlappuzhaAdapter alappuzhaAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView alappuzha_recyclerview;
    private static ArrayList<CityModel> alappuzhadata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alappuzha);
        alappuzha_recyclerview = findViewById(R.id.alappuzha_recycler_view);
        alappuzha_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        alappuzha_recyclerview.setLayoutManager(linearLayout);


        alappuzhadata = new ArrayList<CityModel>();
        for (int i = 0; i < AlappuzhaData.nameArray.length; i++) {
            alappuzhadata.add(new CityModel(
                    AlappuzhaData.nameArray[i],
                    AlappuzhaData.versionArray[i],
                    AlappuzhaData.id_[i],
                    AlappuzhaData.drawableArray[i]
            ));
        }

        alappuzhaAdapter = new AlappuzhaAdapter(alappuzhadata);
        alappuzha_recyclerview.setAdapter(alappuzhaAdapter);
    }

}
