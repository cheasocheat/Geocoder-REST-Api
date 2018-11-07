package com.glf.geocoding.model.mapquest;

/**
 * Created by cheasocheat
 * On 07, Nov, 2018
 */
public class Info {
    private Copyright copyright;

    private String statuscode;

    private String[] messages;

    public Copyright getCopyright ()
    {
        return copyright;
    }

    public void setCopyright (Copyright copyright)
    {
        this.copyright = copyright;
    }

    public String getStatuscode ()
    {
        return statuscode;
    }

    public void setStatuscode (String statuscode)
    {
        this.statuscode = statuscode;
    }

    public String[] getMessages ()
    {
        return messages;
    }

    public void setMessages (String[] messages)
    {
        this.messages = messages;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [copyright = "+copyright+", statuscode = "+statuscode+", messages = "+messages+"]";
    }
}
