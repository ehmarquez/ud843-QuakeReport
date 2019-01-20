package com.example.android.quakereport;

public class Earthquake {

    // Private members
    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String mUrl;

    /**
     * Constructor for {@link Earthquake}
     * @param magnitude measurement for the earthquake
     * @param location city location
     * @param date time it occured
     */
    public Earthquake(double magnitude, String location, long date, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}
