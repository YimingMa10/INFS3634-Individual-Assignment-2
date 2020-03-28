package com.example.assignment2;

// Define the Restaurant Object Structure
// Setup Constructor, Getter and Setter
public class Restaurant {
    private String rName;
    private String rCuisine;
    private String rBuilding;
    private String rStreet;
    private String rSuburb;
    private String rState;
    private String rPostcode;
    private String rRating;
    private int imageId;
    private BusinessHour bh;
    private String rPhone;
    private String rWebsite;

    public Restaurant(String rName, String rCuisine, String rBuilding, String rStreet, String rSuburb, String rState, String rPostcode, String rRating, int imageId, BusinessHour bh, String rPhone, String rWebsite) {
        this.rName = rName;
        this.rCuisine = rCuisine;
        this.rBuilding = rBuilding;
        this.rStreet = rStreet;
        this.rSuburb = rSuburb;
        this.rState = rState;
        this.rPostcode = rPostcode;
        this.rRating = rRating;
        this.imageId = imageId;
        this.bh = bh;
        this.rPhone = rPhone;
        this.rWebsite = rWebsite;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrCuisine() {
        return rCuisine;
    }

    public void setrCuisine(String rCuisine) {
        this.rCuisine = rCuisine;
    }

    public String getrBuilding() {
        return rBuilding;
    }

    public void setrBuilding(String rBuilding) {
        this.rBuilding = rBuilding;
    }

    public String getrAddress() {
        return this.rStreet + ", " + this.rSuburb + " " + this.rState + " " + this.rPostcode;
    }

    public String getrStreet() {
        return rStreet;
    }

    public void setrStreet(String rStreet) {
        this.rStreet = rStreet;
    }

    public String getrSuburb() {
        return rSuburb;
    }

    public void setrSuburb(String rSuburb) {
        this.rSuburb = rSuburb;
    }

    public String getrState() {
        return rState;
    }

    public void setrState(String rState) {
        this.rState = rState;
    }

    public String getrPostcode() {
        return rPostcode;
    }

    public void setrPostcode(String rPostcode) {
        this.rPostcode = rPostcode;
    }

    public String getrRating() {
        return rRating;
    }

    public void setrRating(String rRating) {
        this.rRating = rRating;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public BusinessHour getBh() {
        return bh;
    }

    public void setBh(BusinessHour bh) {
        this.bh = bh;
    }

    public String getrPhone() {
        return rPhone;
    }

    public void setrPhone(String rPhone) {
        this.rPhone = rPhone;
    }

    public String getrWebsite() {
        return rWebsite;
    }

    public void setrWebsite(String rWebsite) {
        this.rWebsite = rWebsite;
    }

    // Inner class for business hour
    public static class BusinessHour {
        private String monday;
        private String tuesday;
        private String wednesday;
        private String thursday;
        private String friday;
        private String saturday;
        private String sunday;

        public BusinessHour(String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday) {
            this.monday = monday;
            this.tuesday = tuesday;
            this.wednesday = wednesday;
            this.thursday = thursday;
            this.friday = friday;
            this.saturday = saturday;
            this.sunday = sunday;
        }

        public String getMonday() {
            return monday;
        }

        public void setMonday(String monday) {
            this.monday = monday;
        }

        public String getTuesday() {
            return tuesday;
        }

        public void setTuesday(String tuesday) {
            this.tuesday = tuesday;
        }

        public String getWednesday() {
            return wednesday;
        }

        public void setWednesday(String wednesday) {
            this.wednesday = wednesday;
        }

        public String getThursday() {
            return thursday;
        }

        public void setThursday(String thursday) {
            this.thursday = thursday;
        }

        public String getFriday() {
            return friday;
        }

        public void setFriday(String friday) {
            this.friday = friday;
        }

        public String getSaturday() {
            return saturday;
        }

        public void setSaturday(String saturday) {
            this.saturday = saturday;
        }

        public String getSunday() {
            return sunday;
        }

        public void setSunday(String sunday) {
            this.sunday = sunday;
        }
    }
}
