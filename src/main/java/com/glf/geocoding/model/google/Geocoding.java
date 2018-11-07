package com.glf.geocoding.model.google;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class Geocoding {
    @JsonProperty("error_message")
    private String errorMessage;

    private String status;

    @JsonProperty(value="results")
    private GeocodingResult[] geocodingResults;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public GeocodingResult[] getGeocodingResults() {
        return geocodingResults;
    }

    public void setGeocodingResults(GeocodingResult[] geocodingResults) {
        this.geocodingResults = geocodingResults;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "Geocoding [status=" + status + ", geocodingResults=" + Arrays.toString(geocodingResults) + "]";
    }
}
