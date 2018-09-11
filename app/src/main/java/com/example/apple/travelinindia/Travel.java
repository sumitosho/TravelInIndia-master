package com.example.apple.travelinindia;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.apple.travelinindia.datamodel.DataModelTravel;
import com.example.apple.travelinindia.mydata.TravelData;
import com.example.apple.travelinindia.traveldata.TravelAdapter;

import java.util.ArrayList;
import java.util.List;


public class Travel extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,SearchView.OnQueryTextListener{
    private TravelAdapter adapter2;
    private RecyclerView.LayoutManager linearLayout;
    private static RecyclerView recyclerView2;
    private static ArrayList<DataModelTravel> data2;




    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView2 = findViewById(R.id.my_recycler_view2);
        recyclerView2.setHasFixedSize(true);
        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
        recyclerView2.setLayoutManager(linearLayout);


        data2 = new ArrayList<DataModelTravel>();
        for (int i = 0; i < TravelData.nameofPlace.length; i++) {
            data2.add(new DataModelTravel(
                    TravelData.nameofPlace[i],
                    TravelData.id2[i],
                    TravelData.drawableArray2[i]
            ));
        }

        adapter2 = new TravelAdapter(data2, this);
        recyclerView2.setAdapter(adapter2);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.travel, menu);
        final MenuItem item = menu.findItem(R.id.search_button);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(item);
        searchView.setOnQueryTextListener(this);


        return true;
    }






    @Override
    public boolean onOptionsItemSelected( MenuItem item ) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected( MenuItem item ) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_city) {
            // Handle the camera action
        } else if (id == R.id.nav_travel) {

        } else if (id == R.id.nav_utility) {

        } else if (id == R.id.nav_emergency) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_signout) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public boolean onQueryTextSubmit( String query ) {
        return false;
    }

    @Override
    public boolean onQueryTextChange( String newText ) {
        final List<DataModelTravel> filteredModelList = filter(data2, newText);

        adapter2.setFilter(filteredModelList);
        return true;
    }
    private List<DataModelTravel> filter( List<DataModelTravel> models, String query) {
        query = query.toLowerCase();final List<DataModelTravel> filteredModelList = new ArrayList<>();
        for (DataModelTravel model : models) {
            final String text = model.getName().toLowerCase();
            if (text.contains(query)) {
                filteredModelList.add(model);
            }
        }
        return filteredModelList;
    }




}
