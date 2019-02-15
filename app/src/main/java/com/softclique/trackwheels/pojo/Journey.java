package com.softclique.trackwheels.pojo;

public class Journey {
    private String uid,jid;
    private long timestamp;
    private long start_time,end_time;
    private Geopoint start,end,point;
    private LocationLogs[] location_logs;
    private String type;
    /*
    Start Journey (req)
     */

    public Journey(String uid, long start_time, String type, Geopoint start) {
        this.uid = uid;
        this.start_time = start_time;
        this.start = start;
        this.type = type;
    }
    /*
    start journey res
     */

    public Journey(String jid) {
        this.jid = jid;
    }
    /*
    Stop Journey (req)
     */

    public Journey(String uid, Geopoint end,String jid, long end_time) {
        this.uid = uid;
        this.end_time = end_time;
        this.end = end;
        this.jid = jid;
    }
    /*
    getJourneyDetails (req)
     */

    public Journey(String uid, String jid) {
        this.uid = uid;
        this.jid = jid;
    }
    /*
      getJourneyDetails (res)

     */

    public Journey(long start_time, long end_time, Geopoint start, Geopoint end, LocationLogs[] location_logs) {
        this.start_time = start_time;
        this.end_time = end_time;
        this.start = start;
        this.end = end;
        this.location_logs = location_logs;
    }
    /*
    addLocationLog (req)
     */

    public Journey(String uid, String jid, long timestamp, Geopoint point) {
        this.uid = uid;
        this.jid = jid;
        this.timestamp = timestamp;
        this.point = point;
    }
}
