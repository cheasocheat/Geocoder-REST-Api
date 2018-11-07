package com.glf.geocoding.model.google;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class GeocodingResult {
    @JsonProperty(value = "address_components")
    private AddressComponent[] addressComponents;

    @JsonProperty(value = "formatted_address")
    private String formattedAddress;

    @JsonProperty("place_id")
    private String placeId;

    @JsonProperty("partial_match")
    private boolean partialMatch;

    @JsonProperty("geometry")
    private Geometry geometry;

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public AddressComponent[] getAddressComponents() {
        return addressComponents;
    }

    public void setAddressComponents(AddressComponent[] addressComponents) {
        this.addressComponents = addressComponents;
    }

    public boolean getPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(boolean partialMatch) {
        this.partialMatch = partialMatch;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @Override
    public String toString() {
        return "GeocodingResult [formattedAddress=" + formattedAddress + ", placeId=" + placeId + "]";
    }
}
