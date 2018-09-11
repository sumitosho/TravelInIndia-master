package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.HyderAdapter;
import com.example.apple.travelinindia.cityadapter.JaisalmerAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.HyderaData;
import com.example.apple.travelinindia.mydata.JaisalmerData;

import java.util.ArrayList;

public class JaisalmerActivity extends AppCompatActivity {
    private JaisalmerAdapter jaisalmerAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView jaisalmer_recyclerview;
    private static ArrayList<CityModel> jaisalmerdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jaisalmer);
        jaisalmer_recyclerview = findViewById(R.id.jaisalmer_recycler_view);
        jaisalmer_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        jaisalmer_recyclerview.setLayoutManager(linearLayout);


        jaisalmerdata = new ArrayList<CityModel>();
        for (int i = 0; i < JaisalmerData.nameArray.length; i++) {
            jaisalmerdata.add(new CityModel(
                    JaisalmerData.nameArray[i],
                    JaisalmerData.versionArray[i],
                    JaisalmerData.id_[i],
                    JaisalmerData.drawableArray[i]
            ));
        }

        jaisalmerAdapter = new JaisalmerAdapter(jaisalmerdata);
        jaisalmer_recyclerview.setAdapter(jaisalmerAdapter);
    }
}
