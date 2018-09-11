package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.RishikeshAdapter;
import com.example.apple.travelinindia.cityadapter.ShimlaAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.RishikeshData;
import com.example.apple.travelinindia.mydata.ShimlaData;

import java.util.ArrayList;

public class ShimlaActivity extends AppCompatActivity {

    private ShimlaAdapter shimlaAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView shimla_recyclerview;
    private static ArrayList<CityModel> shimlahdata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimla);
        shimla_recyclerview = findViewById(R.id.shimla_recycler_view);
        shimla_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        shimla_recyclerview.setLayoutManager(linearLayout);


        shimlahdata = new ArrayList<CityModel>();
        for (int i = 0; i < ShimlaData.nameArray.length; i++) {
            shimlahdata.add(new CityModel(
                    ShimlaData.nameArray[i],
                    ShimlaData.versionArray[i],
                    ShimlaData.id_[i],
                    ShimlaData.drawableArray[i]
            ));
        }

        shimlaAdapter = new ShimlaAdapter(shimlahdata);
        shimla_recyclerview.setAdapter(shimlaAdapter);
    }
}
