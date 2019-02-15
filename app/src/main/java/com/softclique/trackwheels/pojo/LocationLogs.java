package com.softclique.trackwheels.pojo;

public class LocationLogs {
    private long timestamp;
    private Geopoint point;

    public LocationLogs(long timestamp, Geopoint point) {
        this.timestamp = timestamp;
        this.point = point;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public Geopoint getPoint() {
        return point;
    }
}
