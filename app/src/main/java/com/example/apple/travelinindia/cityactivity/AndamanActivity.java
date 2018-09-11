package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AmritsarAdapter;
import com.example.apple.travelinindia.cityadapter.AndmanAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AmirtsarData;
import com.example.apple.travelinindia.mydata.AndamanData;

import java.util.ArrayList;

public class AndamanActivity extends AppCompatActivity {
    private AndmanAdapter andmanAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView andaman_recyclerview;
    private static ArrayList<CityModel> andmandata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andaman);
        andaman_recyclerview = findViewById(R.id.andaman_recycler_view);
        andaman_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        andaman_recyclerview.setLayoutManager(linearLayout);


        andmandata = new ArrayList<CityModel>();
        for (int i = 0; i < AndamanData.nameArray.length; i++) {
            andmandata.add(new CityModel(
                    AndamanData.nameArray[i],
                    AndamanData.versionArray[i],
                    AndamanData.id_[i],
                    AndamanData.drawableArray[i]
            ));
        }

        andmanAdapter = new AndmanAdapter(andmandata);
        andaman_recyclerview.setAdapter(andmanAdapter);

    }
}
