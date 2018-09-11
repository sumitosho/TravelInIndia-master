package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.JaisalmerAdapter;
import com.example.apple.travelinindia.cityadapter.JodhpurAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.JaisalmerData;
import com.example.apple.travelinindia.mydata.JodhpurData;

import java.util.ArrayList;

public class JodhpurActivity extends AppCompatActivity {

    private JodhpurAdapter jodhpurAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView jodhpur_recyclerview;
    private static ArrayList<CityModel> jodhapurdata;


    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jodhpur);
        jodhpur_recyclerview = findViewById(R.id.jodhpur_recycler_view);
        jodhpur_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        jodhpur_recyclerview.setLayoutManager(linearLayout);


        jodhapurdata = new ArrayList<CityModel>();
        for (int i = 0; i < JodhpurData.nameArray.length; i++) {
            jodhapurdata.add(new CityModel(
                    JodhpurData.nameArray[i],
                    JodhpurData.versionArray[i],
                    JodhpurData.id_[i],
                    JodhpurData.drawableArray[i]
            ));
        }

        jodhpurAdapter = new JodhpurAdapter(jodhapurdata);
        jodhpur_recyclerview.setAdapter(jodhpurAdapter);
    }
}
