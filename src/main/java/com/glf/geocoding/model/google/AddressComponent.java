package com.glf.geocoding.model.google;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class AddressComponent {
    @JsonProperty("long_name")
    private String longName;
    @JsonProperty("short_name")
    private String shortName;

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
