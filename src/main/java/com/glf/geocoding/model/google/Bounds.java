package com.glf.geocoding.model.google;


/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class Bounds {
    private LatLng northeast;
    private LatLng southwest;

    public LatLng getNortheast() {
        return northeast;
    }

    public void setNortheast(LatLng northeast) {
        this.northeast = northeast;
    }

    public LatLng getSouthwest() {
        return southwest;
    }

    public void setSouthwest(LatLng southwest) {
        this.southwest = southwest;
    }
}
