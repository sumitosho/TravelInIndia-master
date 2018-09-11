package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.DehradunAdapter;
import com.example.apple.travelinindia.cityadapter.DharamAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.DehradunData;
import com.example.apple.travelinindia.mydata.DharamData;

import java.util.ArrayList;

public class DharamshalaActivity extends AppCompatActivity {

    private DharamAdapter dharamAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView dharamshala_recyclerview;
    private static ArrayList<CityModel> dharamdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dharamshala);
        dharamshala_recyclerview = findViewById(R.id.dharamshala_recycler_view);
        dharamshala_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        dharamshala_recyclerview.setLayoutManager(linearLayout);


        dharamdata = new ArrayList<CityModel>();
        for (int i = 0; i < DharamData.nameArray.length; i++) {
            dharamdata.add(new CityModel(
                    DharamData.nameArray[i],
                    DharamData.versionArray[i],
                    DharamData.id_[i],
                    DharamData.drawableArray[i]
            ));
        }

        dharamAdapter= new DharamAdapter(dharamdata);
        dharamshala_recyclerview.setAdapter(dharamAdapter);

    }

}
