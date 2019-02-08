package com.softclique.trackwheels;

public class Context
{
    private String id;

    private String text;

    private String wikidata;

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

    public String getWikidata ()
    {
        return wikidata;
    }

    public void setWikidata (String wikidata)
    {
        this.wikidata = wikidata;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", text = "+text+", wikidata = "+wikidata+"]";
    }
}