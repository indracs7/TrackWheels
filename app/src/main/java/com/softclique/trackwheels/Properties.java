package com.softclique.trackwheels;

public class Properties
{
    private String wikidata;

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
        return "ClassPojo [wikidata = "+wikidata+"]";
    }
}