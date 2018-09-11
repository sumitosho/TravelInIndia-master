package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.JodhpurAdapter;
import com.example.apple.travelinindia.cityadapter.KhajurahoAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.JodhpurData;
import com.example.apple.travelinindia.mydata.KhajurahoData;

import java.util.ArrayList;

public class KhajurahoActivity extends AppCompatActivity {
    private KhajurahoAdapter khajurahoAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView khajuraho_recyclerview;
    private static ArrayList<CityModel> khajurahodata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khajuraho);
        khajuraho_recyclerview = findViewById(R.id.khajuraho_recycler_view);
        khajuraho_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        khajuraho_recyclerview.setLayoutManager(linearLayout);


        khajurahodata = new ArrayList<CityModel>();
        for (int i = 0; i < KhajurahoData.nameArray.length; i++) {
            khajurahodata.add(new CityModel(
                    KhajurahoData.nameArray[i],
                    KhajurahoData.versionArray[i],
                    KhajurahoData.id_[i],
                    KhajurahoData.drawableArray[i]
            ));
        }

        khajurahoAdapter = new KhajurahoAdapter(khajurahodata);
        khajuraho_recyclerview.setAdapter(khajurahoAdapter);
    }
}
