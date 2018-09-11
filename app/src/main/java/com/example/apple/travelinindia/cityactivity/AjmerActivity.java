package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AhmedaAdapter;
import com.example.apple.travelinindia.cityadapter.AjmerAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AhmedaData;
import com.example.apple.travelinindia.mydata.AjmerData;

import java.util.ArrayList;

public class AjmerActivity extends AppCompatActivity {
    private AjmerAdapter ajmerAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView ajmer_recyclerview;
    private static ArrayList<CityModel> ajmerdata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajmer);
        ajmer_recyclerview = findViewById(R.id.ajmer_recycler_view);
        ajmer_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        ajmer_recyclerview.setLayoutManager(linearLayout);


        ajmerdata = new ArrayList<CityModel>();
        for (int i = 0; i < AjmerData.nameArray.length; i++) {
            ajmerdata.add(new CityModel(
                    AjmerData.nameArray[i],
                    AjmerData.versionArray[i],
                    AjmerData.id_[i],
                    AjmerData.drawableArray[i]
            ));
        }

        ajmerAdapter = new AjmerAdapter(ajmerdata);
        ajmer_recyclerview.setAdapter(ajmerAdapter);
    }

}
