package com.example.assignment2;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class RestaurantDetailActivity extends AppCompatActivity {

    // Declare the view in RestaurantDetailActivity
    private TextView rName;
    private ImageView rImage;
    private TextView rAddress;
    private TextView rCuisine;
    private TextView rRating;
    private TextView rPhone;
    private TextView rWebsite;

    private TextView timeMonday;
    private TextView timeTuesday;
    private TextView timeWednesday;
    private TextView timeThursday;
    private TextView timeFriday;
    private TextView timeSaturday;
    private TextView timeSunday;

    private TextView highlightDay;
    private TextView dayOfWeek;
    private TextView todayHour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_detail);

        // Get the position from recycler view
        // Use getRestaurantByPosition in Database class to get the restaurant detail
        Intent intent = getIntent();
        int rPosition = intent.getIntExtra("rPosition", 0);
        final Restaurant restaurant = RestaurantDatabase.getRestaurantByPosition(rPosition);

        // Define the views
        rImage = findViewById(R.id.rImage);
        rName = findViewById(R.id.rName);
        rAddress = findViewById(R.id.rAddress);
        rCuisine = findViewById(R.id.rCuisine);
        rRating = findViewById(R.id.rRating);
        rPhone = findViewById(R.id.rPhone);
        rWebsite = findViewById(R.id.rWebsite);

        // Set the data for the View
        rName.setText(restaurant.getrName());
        rImage.setImageResource(restaurant.getImageId());
        rCuisine.setText(restaurant.getrCuisine());
        rRating.setText(restaurant.getrRating());

        // Setup the address in correct format with the getrAddress method in Restaurant Class
        String addressString = restaurant.getrAddress();
        if(!restaurant.getrBuilding().equals("")){
            addressString = restaurant.getrBuilding() + ",\n" + addressString;
        }
        SpannableString address = new SpannableString(addressString);
        address.setSpan(new UnderlineSpan(), 0, address.length(), 0);
        rAddress.setText(address);

        // Setup an Implicit intent so when user click the address will be redirect to google map
        rAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleMapSearch = "http://www.google.com/maps/search/" + restaurant.getrName() + ", " +restaurant.getrAddress();
                Uri uri = Uri.parse(googleMapSearch);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                v.getContext().startActivity(intent);
            }
        });

        // Setup an Implicit intent so when user click the phone number will be redirect to call
        rPhone.setText(restaurant.getrPhone());
        final String phoneNumber = "tel:" + restaurant.getrPhone().replaceAll("[^\\d.]", "");
        rPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(phoneNumber));
                startActivity(callIntent);
            }
        });

        // When user click the website will be redirect into web browser
        // android:autoLink="web" was set in xml thus no intent needed
        rWebsite.setText(restaurant.getrWebsite());

        // Define and setup Business hours view
        timeMonday = findViewById(R.id.timeMonday);
        timeTuesday = findViewById(R.id.timeTuesday);
        timeWednesday = findViewById(R.id.timeWednesday);
        timeThursday = findViewById(R.id.timeThursday);
        timeFriday = findViewById(R.id.timeFriday);
        timeSaturday = findViewById(R.id.timeSaturday);
        timeSunday = findViewById(R.id.timeSunday);

        timeMonday.setText(restaurant.getBh().getMonday());
        timeTuesday.setText(restaurant.getBh().getTuesday());
        timeWednesday.setText(restaurant.getBh().getWednesday());
        timeThursday.setText(restaurant.getBh().getThursday());
        timeFriday.setText(restaurant.getBh().getFriday());
        timeSaturday.setText(restaurant.getBh().getSaturday());
        timeSunday.setText(restaurant.getBh().getSunday());

        dayOfWeek = findViewById(R.id.dayOfWeek);
        todayHour = findViewById(R.id.todayHour);

        // Get today day of week by using Calendar
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        // Use a switch to setup today business hour at upper part of the screen
        // And highlight current day and business hour at bottom part
        switch (day) {
            case Calendar.MONDAY:
                highlightDay = findViewById(R.id.monday);
                timeMonday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Monday");
                todayHour.setText(restaurant.getBh().getMonday());
                break;
            case Calendar.TUESDAY:
                highlightDay = findViewById(R.id.tuesday);
                timeTuesday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Tuesday");
                todayHour.setText(restaurant.getBh().getTuesday());
                break;
            case Calendar.WEDNESDAY:
                highlightDay = findViewById(R.id.wednesday);
                timeWednesday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Wednesday");
                todayHour.setText(restaurant.getBh().getWednesday());
                break;
            case Calendar.THURSDAY:
                highlightDay = findViewById(R.id.thursday);
                timeThursday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Thursday");
                todayHour.setText(restaurant.getBh().getThursday());
                break;
            case Calendar.FRIDAY:
                highlightDay = findViewById(R.id.friday);
                timeFriday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Friday");
                todayHour.setText(restaurant.getBh().getFriday());
                break;
            case Calendar.SATURDAY:
                highlightDay = findViewById(R.id.saturday);
                timeSaturday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Saturday");
                todayHour.setText(restaurant.getBh().getSaturday());
                break;
            case Calendar.SUNDAY:
                highlightDay = findViewById(R.id.sunday);
                timeSunday.setTypeface(null, Typeface.BOLD);
                dayOfWeek.setText("Sunday");
                todayHour.setText(restaurant.getBh().getSunday());
                break;
        }
        highlightDay.setTypeface(null, Typeface.BOLD);

    }
}
