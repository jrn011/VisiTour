package edu.bucknell.seniordesign;

//import com.google.android.gms.maps.model.TraveListLatLng;

import java.io.Serializable;

/**
 * Created by Jack on 9/29/2017.
 */

public class Location implements Serializable{

    private String locationName;
    private String locationDescription;
    private int GPS;
    private String imageUrl;


    private TraveListLatLng traveListLatLng= new TraveListLatLng();

    public Location (String name) {
        this.locationName = name;
    }

    public Location(String name, String description, TraveListLatLng traveListLatLng, String imageUrl) {
        this.locationName = name;
        this.locationDescription = description;
        this.traveListLatLng = traveListLatLng;
        this.imageUrl = imageUrl;
    }

    public Location(String name, String description, TraveListLatLng traveListLatLng) {
        this.locationName = name;
        this.locationDescription = description;
        this.traveListLatLng = traveListLatLng;
    }

    public TraveListLatLng getTraveListLatLng() {
        return this.traveListLatLng;
    }

    public String getLocationName(){
        return locationName;
    }

    public String getLocationDescription(){
        return locationDescription;
    }

    public String getImageUrl() {return imageUrl; }

    public void setLocationName(String name){
        this.locationName = name;
    }

    public void setLocationDescription(String description){
        this.locationDescription = description;
    }

    public Location() {}
}
