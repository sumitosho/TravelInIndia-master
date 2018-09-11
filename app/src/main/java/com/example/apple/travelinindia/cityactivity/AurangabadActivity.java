package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AndmanAdapter;
import com.example.apple.travelinindia.cityadapter.AurangaAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AmirtsarData;
import com.example.apple.travelinindia.mydata.AurangaData;

import java.util.ArrayList;

public class AurangabadActivity extends AppCompatActivity {

    private AurangaAdapter aurangaAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView aurangadabad_recyclerview;
    private static ArrayList<CityModel> aurangadabaddata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aurangabad);
        aurangadabad_recyclerview = findViewById(R.id.aurangadabad_recycler_view);
        aurangadabad_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        aurangadabad_recyclerview.setLayoutManager(linearLayout);


        aurangadabaddata = new ArrayList<CityModel>();
        for (int i = 0; i < AurangaData.nameArray.length; i++) {
            aurangadabaddata.add(new CityModel(
                    AurangaData.nameArray[i],
                    AurangaData.versionArray[i],
                    AurangaData.id_[i],
                    AurangaData.drawableArray[i]
            ));
        }

        aurangaAdapter = new AurangaAdapter(aurangadabaddata);
        aurangadabad_recyclerview.setAdapter(aurangaAdapter);

    }

}
