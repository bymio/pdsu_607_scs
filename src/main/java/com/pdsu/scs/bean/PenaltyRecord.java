package com.pdsu.scs.bean;

public class PenaltyRecord {
    private Integer id;

    private Integer uid;

    private String reasons;

    private String time;

    private String dutation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getReasons() {
        return reasons;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons == null ? null : reasons.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getDutation() {
        return dutation;
    }

    public void setDutation(String dutation) {
        this.dutation = dutation == null ? null : dutation.trim();
    }
}