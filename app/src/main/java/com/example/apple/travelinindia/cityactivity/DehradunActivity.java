package com.example.apple.travelinindia.cityactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityadapter.DarjeelingAdapter;
import com.example.apple.travelinindia.cityadapter.DehradunAdapter;
import com.example.apple.travelinindia.datamodel.CityModel;
import com.example.apple.travelinindia.mydata.ChandigarhData;
import com.example.apple.travelinindia.mydata.DehradunData;

import java.util.ArrayList;

public class DehradunActivity extends AppCompatActivity {
    private DehradunAdapter dehradunAdapter;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView dehradun_recyclerview;
    private static ArrayList<CityModel> dehradundata;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dehradun);
        dehradun_recyclerview = findViewById(R.id.dehradun_recycler_view);
        dehradun_recyclerview.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        dehradun_recyclerview.setLayoutManager(linearLayout);


        dehradundata = new ArrayList<CityModel>();
        for (int i = 0; i < DehradunData.nameArray.length; i++) {
            dehradundata.add(new CityModel(
                    DehradunData.nameArray[i],
                    DehradunData.versionArray[i],
                    DehradunData.id_[i],
                    DehradunData.drawableArray[i]
            ));
        }

        dehradunAdapter= new DehradunAdapter(dehradundata);
        dehradun_recyclerview.setAdapter(dehradunAdapter);

    }

}
