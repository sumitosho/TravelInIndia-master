package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AgraAdapter;
import com.example.apple.travelinindia.cityadapter.DelhiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AgraData;
import com.example.apple.travelinindia.mydata.DelhiData;

import java.util.ArrayList;

public class DelhiActivity extends AppCompatActivity {
    private DelhiAdapter delhiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView delhi_recyclerview;
    private static ArrayList<CityModel> delhidata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
        delhi_recyclerview = findViewById(R.id.delhi_recycler_view);
        delhi_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        delhi_recyclerview.setLayoutManager(linearLayout);


        delhidata = new ArrayList<CityModel>();
        for (int i = 0; i < DelhiData.nameArray.length; i++) {
            delhidata.add(new CityModel(
                    DelhiData.nameArray[i],
                    DelhiData.versionArray[i],
                    DelhiData.id_[i],
                    DelhiData.drawableArray[i]
            ));
        }

        delhiAdapter = new DelhiAdapter(delhidata);
        delhi_recyclerview.setAdapter(delhiAdapter);

    }

}
