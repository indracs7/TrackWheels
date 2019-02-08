package com.softclique.trackwheels;

public class GeoResponse
{
    private Features[] features;

    private String[] query;

    private String attribution;

    private String type;

    public Features[] getFeatures ()
    {
        return features;
    }

    public void setFeatures (Features[] features)
    {
        this.features = features;
    }

    public String[] getQuery ()
    {
        return query;
    }

    public void setQuery (String[] query)
    {
        this.query = query;
    }

    public String getAttribution ()
    {
        return attribution;
    }

    public void setAttribution (String attribution)
    {
        this.attribution = attribution;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [features = "+features+", query = "+query+", attribution = "+attribution+", type = "+type+"]";
    }
}
