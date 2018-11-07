package com.glf.geocoding.shared;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public enum GeocodeQuality {
    POINT(1, "POINT", "A specific point location."),
    ADDRESS(2, "ADDRESS", "A specific street address location."),
    INTERSECTION(3, "INTERSECTION", "An intersection of two or more streets."),
    STREET(4, "STREET", "The center of a single street block. House number ranges are returned if available."),
    COUNTRY(5, "COUNTRY", "Admin area, largest. For USA, a country."),
    STATE(6, "STATE", "Admin area. For USA, a state."),
    CITY(7, "CITY", "Admin area. For USA, a city."),
    NEIGHBORHOOD(8, "NEIGHBORHOOD", "Admin area. For USA, a neighborhood."),
    ZIP(9, "ZIP_EXTENDED", "Postal code, largest. For USA, a ZIP."),
    ZIP_EXTENDED(10, "ZIP_EXTENDED", "Postal code. For USA, a ZIP+2.");

    private int index;
    private String code;
    private String desc;

    GeocodeQuality(int index, String code, String desc) {
        this.index = index;
        this.code = code;
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
