package com.example.assignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    private ArrayList<Restaurant> restaurantList;

    // This method will get the ArrayList data
    public RestaurantAdapter(ArrayList<Restaurant> restaurantList){
        this.restaurantList = restaurantList;
    }

    // This method will declare and define the view components in recycler template
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView rName;
        public ImageView rImage;
        public TextView rAddress;
        public TextView rCuisine;
        public TextView rBuilding;

        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            rImage = view.findViewById(R.id.rImage);
            rName = view.findViewById(R.id.rName);
            rAddress = view.findViewById(R.id.rAddress);
            rCuisine = view.findViewById(R.id.rCuisine);
            rBuilding = view.findViewById(R.id.rBuilding);
        }
    }

    // This method will set rv_restaurant.xml as recycler template
    @Override
    public RestaurantAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_restaurant, parent, false);
        ViewHolder vh = new ViewHolder(view);

        return vh;
    }

    // This method will setup the view in recycler template
    @Override
    public void onBindViewHolder(RestaurantAdapter.ViewHolder holder, final int position) {
        Restaurant restaurant = restaurantList.get(position);
        holder.rName.setText(restaurant.getrName());
        holder.rImage.setImageResource(restaurant.getImageId());
        holder.rAddress.setText(restaurant.getrAddress());
        holder.rCuisine.setText(restaurant.getrCuisine());
        holder.rBuilding.setText(restaurant.getrBuilding());

        // When the view is click, it will jump to RestaurantDetailActivity
        // Position number will be send to next activity through putExtra
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, RestaurantDetailActivity.class);
                intent.putExtra("rPosition", position);
                context.startActivity(intent);
            }
        });
    }

    // This method will return the number of item in the ArrayList
    @Override
    public int getItemCount() {
        return restaurantList.size();
    }
}
