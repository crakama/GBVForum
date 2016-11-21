package com.dadaabs.mreport;

/**
 * Created by crakama on 11/20/2016.
 */

public class MapModel {

    public MapModel(String latitude, String longitude) {
        this.latitude = latitude; this.longitude = longitude;
    }
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    private String latitude;
    private String longitude;
}
