package com.glf.geocoding.model.mapquest;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class MapQuestGeocoding {
    @JsonProperty("results")
    private MapQuestGeocodingResult[] mapQuestGeocodingResults;

    private Options options;

    private Info info;

    public Options getOptions ()
    {
        return options;
    }

    public void setOptions (Options options)
    {
        this.options = options;
    }

    public Info getInfo ()
    {
        return info;
    }

    public void setInfo (Info info)
    {
        this.info = info;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [results = "+ mapQuestGeocodingResults +", options = "+options+", info = "+info+"]";
    }

    public MapQuestGeocodingResult[] getMapQuestGeocodingResults() {
        return mapQuestGeocodingResults;
    }

    public void setMapQuestGeocodingResults(MapQuestGeocodingResult[] mapQuestGeocodingResults) {
        this.mapQuestGeocodingResults = mapQuestGeocodingResults;
    }
}
