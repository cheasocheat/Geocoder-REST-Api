package com.glf.geocoding.model.mapquest;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class ProvidedLocation {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ClassPojo [location = " + location + "]";
    }
}
