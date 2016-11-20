package com.dadaabs.mreport;

/**
 * Created by crakama on 11/18/2016.
 */

public class ReportModel {
    private String title;
    private int repimage;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRepimage() {
        return repimage;
    }

    public void setRepimage(int repimage) {
        this.repimage = repimage;
    }


    public ReportModel(String title,int repimage) {
        this.title = title;
        this.repimage = repimage;
    }
}
