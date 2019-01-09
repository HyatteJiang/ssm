package com.soecode.lyf.entity;

public class Record {
    private String dt;
    private Integer cnt;

    public Record() {
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getDate() {
        return dt;
    }

    public void setDate(String date) {
        this.dt = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "dt='" + dt + '\'' +
                ", cnt=" + cnt +
                '}';
    }
}
