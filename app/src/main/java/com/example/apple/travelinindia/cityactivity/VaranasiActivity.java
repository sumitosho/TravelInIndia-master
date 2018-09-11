package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.AgraAdapter;
import com.example.apple.travelinindia.cityadapter.JaipurAdapter;
import com.example.apple.travelinindia.cityadapter.VaranasiAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.AgraData;
import com.example.apple.travelinindia.mydata.VaranasiData;

import java.util.ArrayList;

public class VaranasiActivity extends AppCompatActivity {
    private VaranasiAdapter varanasiAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView varanasi_recyclerview;
    private static ArrayList<CityModel> varanasidata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varanasi);
        varanasi_recyclerview = findViewById(R.id.varanasi_recycler_view);
        varanasi_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        varanasi_recyclerview.setLayoutManager(linearLayout);


        varanasidata = new ArrayList<CityModel>();
        for (int i = 0; i < VaranasiData.nameArray.length; i++) {
            varanasidata.add(new CityModel(
                    VaranasiData.nameArray[i],
                    VaranasiData.versionArray[i],
                    VaranasiData.id_[i],
                    VaranasiData.drawableArray[i]
            ));
        }

        varanasiAdapter = new VaranasiAdapter(varanasidata);
        varanasi_recyclerview.setAdapter(varanasiAdapter);

    }

}
