package com.glf.geocoding.model.mapquest;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class Copyright {
    private String text;

    private String imageUrl;

    private String imageAltText;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getImageUrl ()
    {
        return imageUrl;
    }

    public void setImageUrl (String imageUrl)
    {
        this.imageUrl = imageUrl;
    }

    public String getImageAltText ()
    {
        return imageAltText;
    }

    public void setImageAltText (String imageAltText)
    {
        this.imageAltText = imageAltText;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [text = "+text+", imageUrl = "+imageUrl+", imageAltText = "+imageAltText+"]";
    }
}
