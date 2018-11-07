package com.glf.geocoding.model.respose;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.glf.geocoding.model.google.LatLng;
import com.glf.geocoding.shared.StatusCode;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class GeocodingResponse {
    @JsonProperty("status")
    private StatusCode status;
    @JsonProperty("message")
    private String message;
    @JsonProperty("location")
    private LatLng location;

    public StatusCode getStatus() {
        return status;
    }

    public void setStatus(StatusCode status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public static GeocodingResponse setErrorResponse(String message) {
        GeocodingResponse response = new GeocodingResponse();
        response.setStatus(StatusCode.UNKNOWN_ERROR);
        response.setMessage(message.isEmpty() ? StatusCode.UNKNOWN_ERROR.getDesc() : message);
        response.setLocation(null);
        return response;
    }
}
