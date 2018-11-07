package com.glf.geocoding.model.google;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class Geometry {
    @JsonProperty("bounds")
    private Bounds bounds;

    @JsonProperty("location")
    private LatLng location;

    @JsonProperty("location_type")
    private String locationType;

    @JsonProperty("viewport")
    private Bounds viewPort;


    public Bounds getBounds() {
        return bounds;
    }

    public void setBounds(Bounds bounds) {
        this.bounds = bounds;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public String getLocationType() {
        return locationType;
    }

    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    public Bounds getViewPort() {
        return viewPort;
    }

    public void setViewPort(Bounds viewPort) {
        this.viewPort = viewPort;
    }
}
