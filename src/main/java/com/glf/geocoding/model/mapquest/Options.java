package com.glf.geocoding.model.mapquest;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class Options {
    private String ignoreLatLngInput;

    private String thumbMaps;

    private String maxResults;

    public String getIgnoreLatLngInput ()
    {
        return ignoreLatLngInput;
    }

    public void setIgnoreLatLngInput (String ignoreLatLngInput)
    {
        this.ignoreLatLngInput = ignoreLatLngInput;
    }

    public String getThumbMaps ()
    {
        return thumbMaps;
    }

    public void setThumbMaps (String thumbMaps)
    {
        this.thumbMaps = thumbMaps;
    }

    public String getMaxResults ()
    {
        return maxResults;
    }

    public void setMaxResults (String maxResults)
    {
        this.maxResults = maxResults;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ignoreLatLngInput = "+ignoreLatLngInput+", thumbMaps = "+thumbMaps+", maxResults = "+maxResults+"]";
    }
}
