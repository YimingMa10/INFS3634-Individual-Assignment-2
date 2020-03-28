package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Declare RecyclerView and RecyclerView.LayoutManager
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find RecyclerView in layout by Id and setup LayoutManager
        recyclerView = (RecyclerView) findViewById(R.id.rvList);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Get the restaurant data in format of ArrayList from RestaurantDatabase Class
        // Put the ArrayList into RestaurantAdapter
        ArrayList<Restaurant> restaurants = RestaurantDatabase.getAllRestaurants();
        RestaurantAdapter itemAdapter = new RestaurantAdapter(restaurants);
        recyclerView.setAdapter(itemAdapter);
    }
}
