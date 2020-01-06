package com.unicorn.srgasoline.entity;

public class Flowmeter {
    private String sbbm;

    private String sblb;

    private String cldw;

    private String ylbbh;

    private String szwz;

    private String gxbz;

    private String names;

    private String oils;

    private String units;

    public String getSbbm() {
        return sbbm;
    }

    public void setSbbm(String sbbm) {
        this.sbbm = sbbm == null ? null : sbbm.trim();
    }

    public String getSblb() {
        return sblb;
    }

    public void setSblb(String sblb) {
        this.sblb = sblb == null ? null : sblb.trim();
    }

    public String getCldw() {
        return cldw;
    }

    public void setCldw(String cldw) {
        this.cldw = cldw == null ? null : cldw.trim();
    }

    public String getYlbbh() {
        return ylbbh;
    }

    public void setYlbbh(String ylbbh) {
        this.ylbbh = ylbbh == null ? null : ylbbh.trim();
    }

    public String getSzwz() {
        return szwz;
    }

    public void setSzwz(String szwz) {
        this.szwz = szwz == null ? null : szwz.trim();
    }

    public String getGxbz() {
        return gxbz;
    }

    public void setGxbz(String gxbz) {
        this.gxbz = gxbz == null ? null : gxbz.trim();
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names == null ? null : names.trim();
    }

    public String getOils() {
        return oils;
    }

    public void setOils(String oils) {
        this.oils = oils == null ? null : oils.trim();
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units == null ? null : units.trim();
    }
}