package com.softclique.trackwheels;

public class Features
{
    private String place_name;

    private String[] place_type;

    private String[] bbox;

    private String[] center;

    private Context[] context;

    private Geometry geometry;

    private String id;

    private String text;

    private String type;

    private String relevance;

    private Properties properties;

    public String getPlace_name ()
    {
        return place_name;
    }

    public void setPlace_name (String place_name)
    {
        this.place_name = place_name;
    }

    public String[] getPlace_type ()
    {
        return place_type;
    }

    public void setPlace_type (String[] place_type)
    {
        this.place_type = place_type;
    }

    public String[] getBbox ()
    {
        return bbox;
    }

    public void setBbox (String[] bbox)
    {
        this.bbox = bbox;
    }

    public String[] getCenter ()
    {
        return center;
    }

    public void setCenter (String[] center)
    {
        this.center = center;
    }

    public Context[] getContext ()
    {
        return context;
    }

    public void setContext (Context[] context)
    {
        this.context = context;
    }

    public Geometry getGeometry ()
    {
        return geometry;
    }

    public void setGeometry (Geometry geometry)
    {
        this.geometry = geometry;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public String getRelevance ()
    {
        return relevance;
    }

    public void setRelevance (String relevance)
    {
        this.relevance = relevance;
    }

    public Properties getProperties ()
    {
        return properties;
    }

    public void setProperties (Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [place_name = "+place_name+", place_type = "+place_type+", bbox = "+bbox+", center = "+center+", context = "+context+", geometry = "+geometry+", id = "+id+", text = "+text+", type = "+type+", relevance = "+relevance+", properties = "+properties+"]";
    }
}

