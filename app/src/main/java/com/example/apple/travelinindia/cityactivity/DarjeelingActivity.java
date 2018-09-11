package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.ChennaiAdapter;
import com.example.apple.travelinindia.cityadapter.DarjeelingAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.ChandigarhData;
import com.example.apple.travelinindia.mydata.DarjeelingData;

import java.util.ArrayList;

public class DarjeelingActivity extends AppCompatActivity {
    private DarjeelingAdapter darjeelingAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView darjeeling_recyclerview;
    private static ArrayList<CityModel> darjeelingdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_darjeeling);
        darjeeling_recyclerview = findViewById(R.id.darjeeling_recycler_view);
        darjeeling_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        darjeeling_recyclerview.setLayoutManager(linearLayout);


        darjeelingdata = new ArrayList<CityModel>();
        for (int i = 0; i < DarjeelingData.nameArray.length; i++) {
            darjeelingdata.add(new CityModel(
                    DarjeelingData.nameArray[i],
                    DarjeelingData.versionArray[i],
                    DarjeelingData.id_[i],
                    DarjeelingData.drawableArray[i]
            ));
        }

        darjeelingAdapter = new DarjeelingAdapter(darjeelingdata);
        darjeeling_recyclerview.setAdapter(darjeelingAdapter);

    }
}
