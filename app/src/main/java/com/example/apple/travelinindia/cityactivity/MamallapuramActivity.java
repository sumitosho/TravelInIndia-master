package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.MaduraiAdapter;
import com.example.apple.travelinindia.cityadapter.MamallAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.MaduraiData;
import com.example.apple.travelinindia.mydata.MamallData;

import java.util.ArrayList;

public class MamallapuramActivity extends AppCompatActivity {
    private MamallAdapter mamallAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView mamall_recyclerview;
    private static ArrayList<CityModel> mamalldata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mamallapuram);
        mamall_recyclerview = findViewById(R.id.mamall_recycler_view);
        mamall_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        mamall_recyclerview.setLayoutManager(linearLayout);


        mamalldata = new ArrayList<CityModel>();
        for (int i = 0; i < MamallData.nameArray.length; i++) {
            mamalldata.add(new CityModel(
                    MamallData.nameArray[i],
                    MamallData.versionArray[i],
                    MamallData.id_[i],
                    MamallData.drawableArray[i]
            ));
        }

        mamallAdapter = new MamallAdapter(mamalldata);
        mamall_recyclerview.setAdapter(mamallAdapter);
    }
}
