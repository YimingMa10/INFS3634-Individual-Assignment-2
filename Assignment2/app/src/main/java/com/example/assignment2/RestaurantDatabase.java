package com.example.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// This class is for static database data
public class RestaurantDatabase {

    // Declare HashMap for restaurants adata
    public static final HashMap<Integer, Restaurant> restaurants = new HashMap<>();

    // Return restaurant instance with given position number
    public static Restaurant getRestaurantByPosition(int position){
        return restaurants.get(position);
    }

    // Return all restaurant data in a Restaurant ArrayList
    public static ArrayList<Restaurant> getAllRestaurants() {
        return new ArrayList<Restaurant>((List) Arrays.asList(restaurants.values().toArray()));
    }

    // Declare restaurants data and put them in the hashmap
    static {
        restaurants.put(0, new Restaurant(
                "GoodTime Burgers",
                "Burger, American",
                "Level 3 Westield Bondi Junction",
                "500 Oxford St",
                "Bondi Junction",
                "NSW",
                "2022",
                "Very delicious burgers, I could eat two burgers even! But the fries were slightly too greasy.",
                R.drawable.goodtime_burgers,
                new Restaurant.BusinessHour("11:30am-10pm",
                        "11:30am-10pm",
                        "11:30am-10pm",
                        "11:30am-10pm",
                        "11:30am-10pm",
                        "11:30am-10pm",
                        "11:30am-10pm"),
                "(02) 9387 7828",
                "https://www.facebook.com/goodtimeburgers1/"
        ));

        restaurants.put(1, new Restaurant(
                "Fat Noodle",
                "Asian, Chinese, Vietnamese",
                "The Star",
                "80 Pyrmont St",
                "Pyrmont",
                "NSW",
                "2009",
                "Vietnamese restaurant from the heart of city for people who loves Pho! Desserts are also delicous.",
                R.drawable.fatnoodle,
                new Restaurant.BusinessHour("11:30am-2am",
                        "11:30am-2am",
                        "11:30am-2am",
                        "11:30am-2am",
                        "11:30am-5am",
                        "11:30am-5am",
                        "11:30am-2am"),
                "1800 700 700",
                "https://www.star.com.au/sydney/eat-and-drink/casual-dining/fat-noodle"
        ));

        restaurants.put(2, new Restaurant(
                "Franchi Brothers Italian Bar",
                "Italian, Pizza",
                "",
                "438 Oxford St",
                "Paddington",
                "NSW",
                "2021",
                "Great place for great pizzas! A must visit for Italian lovers.",
                R.drawable.franchi_brother,
                new Restaurant.BusinessHour("closed",
                        "12-3pm, 5:30-9:30pm",
                        "12-3pm, 5:30-9:30pm",
                        "12-3pm, 5:30-9:30pm",
                        "12-3pm, 5:30-10pm",
                        "12-3pm, 5-10pm",
                        "6-9pm"),
                "(02) 8021 3346",
                "https://www.italianbar.com.au/"
        ));

        restaurants.put(3, new Restaurant(
                "Marina Lunga",
                "Italian, Pizza",
                "",
                "367 Darling St",
                "Balmain",
                "NSW",
                "2041",
                "A lovely little Italian restaurant based in Balmain. Visited several times before as I was impressed by the food. Pizzas and pastas were very delicious. But have to wait a very long time.",
                R.drawable.marina_lunga,
                new Restaurant.BusinessHour("5:30-10pm",
                        "5:30-10pm",
                        "5:30-10pm",
                        "5:30-10pm",
                        "5:30-10pm",
                        "5:30-10pm",
                        "5:30-10pm"),
                "(02) 9810 0292",
                "https://marinalunga.com.au/"

        ));

        restaurants.put(4, new Restaurant(
                "Coogee Diggers - The Bunker",
                "Café food, Cafe, Coffee, Tea, Bars, Beer",
                "",
                "2 Byron Street",
                "Coogee",
                "NSW",
                "2034",
                "A fashion place that full of design and music. Latte is really smooth. Many drinks offered timely.",
                R.drawable.the_bunker,
                new Restaurant.BusinessHour("11am-10:30pm",
                        "11am-10:30pm",
                        "11am-10:30pm",
                        "11am-10:30pm",
                        "11am-12:30am",
                        "11am-12:30am",
                        "11am-12am"),
                "(02) 9665 4466",
                "https://www.coogeediggers.com.au/"
        ));

        restaurants.put(5, new Restaurant(
                "Sydney Madang",
                "Korean, BBQ",
                "",
                "371A Pitt St",
                "Sydney",
                "NSW",
                "2000",
                "The pork belly, beef bolgolgi, marinated chicken are must ordered. A good quality meat that was easy to eat and almost melted in your mouth.",
                R.drawable.sydney_madang,
                new Restaurant.BusinessHour("12pm-12am",
                        "12pm-12am",
                        "12pm-12am",
                        "12pm-2am",
                        "12pm-2am",
                        "12pm-2am",
                        "12pm-2am"),
                "(02) 9264 7010",
                "https://www.facebook.com/Madang2006/"
        ));

        restaurants.put(6, new Restaurant(
                "Revolver Cafe",
                "Café food, Cafe, Coffee, Tea",
                "",
                "291 Annandale St",
                "Annandale",
                "NSW",
                "2038",
                "There are many beverages offered in place, desserts are tasted great, and friendly services. ",
                R.drawable.revolver,
                new Restaurant.BusinessHour("8am-4pm",
                        "8am-4pm",
                        "8am-4pm",
                        "8am-4pm",
                        "8am-4pm",
                        "8am-4pm",
                        "8am-4pm"),
                "(02) 9555 4727",
                "https://revolver.com.au/"
        ));

        restaurants.put(7, new Restaurant(
                "Cho Cho San",
                "Japanese, Asian",
                "",
                "73 MacLeay St",
                "Potts Point",
                "NSW",
                "2011",
                "Place has good ambience. The food is nice there and amazing cocktails too, my fave would be raspberry slushy with whiskey. My fave food would be beef tataki and stuffed squid.",
                R.drawable.cho_cho_san,
                new Restaurant.BusinessHour("5:30-10pm",
                        "5:30-10pm",
                        "5:30-10pm",
                        "5:30-10:30pm",
                        "12-11pm",
                        "12-11pm",
                        "12-10pm"),
                "(02) 9331 6601",
                "http://www.chochosan.com.au/food"
        ));

        restaurants.put(8, new Restaurant(
                "Mr. Wong",
                "Chinese, Asian, Cantonese, Yum Cha",
                "Establishment Hotel",
                "3 Bridge Ln",
                "Sydney",
                "NSW",
                "2000",
                "Have visited this place countless times and it’s one of the finest Chinese restaurants in Sydney CBD. If you order their best dishes, it’s probably the best Chinese restaurant in city. I like their dumplings, duck dishes and fried rice. It’s a great place to have business lunches or dates.",
                R.drawable.mr_wong,
                new Restaurant.BusinessHour("12-3pm, 5:30-11pm",
                        "12-3pm, 5:30-11pm",
                        "12-3pm, 5:30-11pm",
                        "12-3pm, 5:30pm-12am",
                        "12-3pm, 5:30pm-12am",
                        "10:30am-3pm, 5:30pm-12am",
                        "10:30am-3pm, 5:30pm-10pm"),
                "(02) 9114 7317",
                "https://merivale.com.au/mrwong/menu/2138/"
        ));

        restaurants.put(9, new Restaurant(
                "KOI Dessert Bar",
                "Desserts, Modern Australia",
                "",
                "46 Kensington St",
                "Chippendale",
                "NSW",
                "2008",
                "Strawberry pillow is one of my favorite cake, the cream is smooth and melted in mouth. ",
                R.drawable.koi_dessert_bar,
                new Restaurant.BusinessHour("10am-11pm",
                        "10am-11pm",
                        "10am-11pm",
                        "10am-11pm",
                        "10am-11pm",
                        "10am-11pm",
                        "10am-11pm"),
                "(02) 9212 1230",
                "http://www.koidessertbar.com.au/home"
        ));
    }
}
