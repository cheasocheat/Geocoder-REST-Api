package com.glf.geocoding.model.mapquest;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class MapQuestGeocodingResult {
    private Location[] locations;

    private ProvidedLocation providedLocation;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public ProvidedLocation getProvidedLocation() {
        return providedLocation;
    }

    public void setProvidedLocation(ProvidedLocation providedLocation) {
        this.providedLocation = providedLocation;
    }

    @Override
    public String toString() {
        return "ClassPojo [locations = " + locations + ", providedLocation = " + providedLocation + "]";
    }
}