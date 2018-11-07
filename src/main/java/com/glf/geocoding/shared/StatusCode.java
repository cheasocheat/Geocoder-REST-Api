package com.glf.geocoding.shared;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public enum StatusCode {
    OK("OK", "Request success."),
    OVER_QUERY_LIMIT("OVER_QUERY_LIMIT", "Query over limited per day."),
    OVER_DAILY_LIMIT("OVER_DAILY_LIMIT","The API key is missing or invalid."),
    REQUEST_DENIED("REQUEST_DENIED", "This API project is not authorized to use this API."),
    INVALID_REQUEST("INVALID_REQUEST","Missing query params."),
    UNKNOWN_ERROR("UNKNOWN_ERROR","Server error."),
    ZERO_RESULTS("ZERO_RESULTS","Returned no results.");

    private String code;
    private String desc;

    StatusCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
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
